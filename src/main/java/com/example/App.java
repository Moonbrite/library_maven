package com.example;

import com.example.buisness.Book;
import com.example.buisness.services.BookService;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    public static BookService  bookService = new BookService();

    public static void main( String[] args )
    {
        Book book1 = new Book("Le livre de ouf", 1999, "José");
        bookService.addBook(book1);

        List<Book> bookList;
        bookList = bookService.getBooks();

        System.out.println(bookList);

    }
}
