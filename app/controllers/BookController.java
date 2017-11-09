package controllers;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.ebean.Ebean;
import models.Book;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

public class BookController extends Controller{

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


}
