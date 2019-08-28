package com.jethro.springapi.DAO;

import com.jethro.springapi.Model.Book;

import java.util.List;

public interface BookDao {

    long save(Book book);
    Book get(long bookid);
    List<Book> list();
    void update(long bookid, Book book);
    void delete(long bookid);
}
