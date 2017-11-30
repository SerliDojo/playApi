package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.ebean.Finder;
import io.ebean.Model;
import io.ebean.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Book extends Model {

    @Id
    private Integer id;

    private String name;

    private String category;

    private Date date;

    public static Finder<Integer, Book> find = new Finder<Integer, Book>(Book.class);

    public static List<Book> getAllBooks() { return find.all();}

    public static List<Book> getByCategory(String category) {
        return find.query().where().like("category",category).findList();
    }


    /*saveBook
            deleteBook
    getAllBooks
            getBookByName
    getByGenre
            getByCategorie
    getByLanguage*/



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
