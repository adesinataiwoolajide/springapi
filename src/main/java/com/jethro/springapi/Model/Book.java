package com.jethro.springapi.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "book")
@Setter
@Getter
public class Book {
    public Book() {
    }

    public Long getBookid() {
        return bookid;
    }

    public void setBookid(Long bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bookid")
    private Long bookid;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;

    @Column(name = "category")
    private String category;

}
