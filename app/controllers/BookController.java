package controllers;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.ebean.Ebean;
import models.Book;
import play.libs.Json;
import play.mvc.*;
import java.util.*;
import play.libs.ws.*;
import java.util.concurrent.CompletionStage;
import javax.inject.Inject;

public class BookController extends Controller{

    private final WSClient ws;

    @Inject
    public  BookController(WSClient ws) {
      this.ws = ws;
    }


    public Result index(Optional<String> categorie) {

        List<Book> books = categorie.map(Book::getByCategory)
                        .orElseGet(Book::getAllBooks);

        System.out.println(categorie.isPresent());

        List<Book> allBooks = Book.getAllBooks();
        Set<String> cats = new HashSet<String>();
        for (Book b : allBooks) {
          cats.add(b.getCategory());
        }

        return ok(views.html.book.index.render(books, cats));
    }

    /**
     * save a book.
     *
     * @return a result
     */
    public Result saveBook() {
        Book book = Json.fromJson(request().body().asJson(),Book.class);
        Ebean.save(book);
        ObjectNode node = Json.newObject();
        node.put("id",book.getId());
        return created(node);
    }

    public Result all(){
        return ok(Json.toJson(Book.getAllBooks()));
    }

    public Result allByCategory(String categorie){
        return ok(Json.toJson(Book.getByCategory(categorie)));
    }

    /**
    *Import books
    *
    */

    public Result importBooks(String author) {
      WSRequest request = ws.url("http://openlibrary.org/search.json");
      request = request.addQueryParameter("author", author);

      request.get()
        .thenApply(resp -> Json.parse(resp.getBody()))
        .thenAccept(json -> toList(json.get("docs").elements())
          .stream()
          .map(book -> book.get("title").textValue().toLowerCase())
          .distinct()
          .map(book -> new Book(book))
          .forEach(book -> {
            try {
              Thread.sleep(100);
            } catch (Exception ex) {
              // dont care ...
            }
            Ebean.save(book);
          }));

        return ok("import in progress ...");
    }

    private <T> List<T> toList(Iterator<T> it) {
      List<T> list = new ArrayList<T>();
      while(it.hasNext()) {
        list.add(it.next());
      }
      return list;
    }
}
