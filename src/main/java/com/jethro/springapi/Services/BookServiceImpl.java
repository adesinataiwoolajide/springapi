package com.jethro.springapi.Services;

import com.jethro.springapi.DAO.BookDao;
import com.jethro.springapi.Model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public long save(Book book) {
        return 0;
    }

    @Override
    public Book get(long bookid) {
        return null;
    }

    @Override
    @Transactional
    public List<Book> list() {
        return bookDao.list();
    }

    @Override
    public void update(long bookid, Book book) {

    }

    @Override
    public void delete(long bookid) {

    }
}
