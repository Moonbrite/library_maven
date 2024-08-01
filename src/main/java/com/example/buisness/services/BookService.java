package com.example.buisness.services;

import com.example.buisness.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.List;

import static com.example.buisness.HibernateConfig.getSessionFactory;


public class BookService {

    public void addBook(Book book) {
        Transaction transaction = null;
        try (Session session = getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(book);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Book> getBooks(){
        try (Session session = getSessionFactory().openSession()) {
            return session.createQuery("from Book", Book.class).list();
        }
    }

}
