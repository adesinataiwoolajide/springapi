package com.jethro.springapi.Services;

import com.jethro.springapi.Model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    long save(Book book);
    Book get(long bookid);
    List<Book> list();
    void update(long bookid, Book book);
    void delete(long bookid);
}
