package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BooksInHandsTestSuite {
    @Test
    public void testUserWithNoBooks(){
        LibraryDatabase databaseMock = mock(LibraryDatabase.class);
        BookLibrary library = new BookLibrary(databaseMock);
        LibraryUser zeroBookUser = new LibraryUser("A","A","0");
        when(databaseMock.listBooksInHandsOf(zeroBookUser)).thenReturn(new ArrayList<Book>());
        List<Book> bookList = library.listBooksInHandsOf(zeroBookUser);
        Assert.assertEquals(0,bookList.size());
    }
    @Test
    public void testUserWithOneBook(){
        LibraryDatabase databaseMock = mock(LibraryDatabase.class);
        BookLibrary library = new BookLibrary(databaseMock);
        LibraryUser oneBookUser = new LibraryUser("B","B","1");
        List<Book> testList = new ArrayList<Book>();
        testList.add(new Book("Author1","Title1",2009));
        when(databaseMock.listBooksInHandsOf(oneBookUser)).thenReturn(testList);
        List<Book> bookList = library.listBooksInHandsOf(oneBookUser);
        Assert.assertEquals(1,bookList.size());
    }
    @Test
    public void testUserWithFiveBooks(){
        LibraryDatabase databaseMock = mock(LibraryDatabase.class);
        BookLibrary library = new BookLibrary(databaseMock);
        LibraryUser fiveBookUser = new LibraryUser("C","C","5");
        List<Book> testList = new ArrayList<Book>();
        testList.add(new Book("Author1","Title1",2009));
        testList.add(new Book("Author2","Title2",2012));
        testList.add(new Book("Author3","Title3",2011));
        testList.add(new Book("Author4","Title4",2006));
        testList.add(new Book("Author5","Title5",2004));
        when(databaseMock.listBooksInHandsOf(fiveBookUser)).thenReturn(testList);
        List<Book> bookList = library.listBooksInHandsOf(fiveBookUser);
        Assert.assertEquals(5,bookList.size());
    }
}
