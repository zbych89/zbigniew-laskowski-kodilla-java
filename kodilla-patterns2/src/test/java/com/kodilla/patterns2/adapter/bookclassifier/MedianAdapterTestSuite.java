package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> books = new HashSet<>();
        Book book1 = new Book("J.R.R. Tolkien","Hobbit",1997,"ABC1");
        Book book2 = new Book("H. Sienkiewicz","Krzyzacy",2004,"ABC2");
        Book book3 = new Book("J. Gutenberg","Bible",1546,"ABC3");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        //When
        MedianAdapter adapter = new MedianAdapter();
        int median = adapter.publicationYearMedian(books);
        //Then
        Assert.assertEquals(1997,median);
    }
}
