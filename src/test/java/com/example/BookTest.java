package com.example;

import com.example.buisness.Book;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookTest {

    @Test public void testBook(){
        Book book1 = new Book("Le livre de ouf le test", 1999, "José");
        Assert.assertEquals(book1.getAge(),25);
    }

}
