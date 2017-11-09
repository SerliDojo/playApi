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
    @JsonIgnore
    private Date date;
    @JsonIgnore
    private String pictureLink;
    @JsonIgnore
    private String editor;
    @JsonIgnore
    private String resume;
    @JsonIgnore
    private Boolean isCollection;
    @JsonIgnore
    private Integer numCollection;
    @JsonIgnore
    private Integer numMaxCollection;
    @JsonIgnore
    private String tpye; // merci laurent !!
    @JsonIgnore
    private String language;

    public static Finder<Integer, Book> find = new Finder<Integer, Book>(Book.class);

    public static List<Book> getAllBooks() { return find.all();}

    public static List<Book> getByCategory(String category) {
        return find.query().where().like("category",category).findList();
    }

    public static List<Book> getByTpye(String tpye) {
        return find.query().where().like("tpye",tpye).findList();
    }

    public static List<Book> getByLanguage(String language) {
        return find.query().where().like("language",language).findList();
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

    public String getPictureLink() {
        return pictureLink;
    }

    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Boolean getCollection() {
        return isCollection;
    }

    public void setCollection(Boolean collection) {
        isCollection = collection;
    }

    public Integer getNumCollection() {
        return numCollection;
    }

    public void setNumCollection(Integer numCollection) {
        this.numCollection = numCollection;
    }

    public Integer getNumMaxCollection() {
        return numMaxCollection;
    }

    public void setNumMaxCollection(Integer numMaxCollection) {
        this.numMaxCollection = numMaxCollection;
    }

    public String getTpye() {
        return tpye;
    }

    public void setTpye(String tpye) {
        this.tpye = tpye;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
