package com.jethro.springapi.DAO;

import com.jethro.springapi.Model.Book;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class BookDaoImple implements BookDao {

    /**
     *
     */


    @Autowired
    private EntityManager entityManager;

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }

    @Override
    public long save(Book book) {
        return 0;
    }

    @Override
    public Book get(long bookid) {
        return null;
    }

    @Override
    public List<Book> list() {
        List<Book>  list = getSession().createQuery(" from Book").list();
        return list;
    }

    @Override
    public void update(long bookid, Book book) {

    }

    @Override
    public void delete(long bookid) {

    }
}
