package com.jethro.springapi.Controller;

import com.jethro.springapi.Model.Book;
import com.jethro.springapi.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("api/books")
    public ResponseEntity<List<Book>> list(){
        List<Book> list = bookService.list();
        return ResponseEntity.ok().body(list);
    }
}
