package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Set;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        Library library = new Library("Library1");
        Book book1 = new Book("Title1","Author1", LocalDate.now());
        Book book2 = new Book("Title2","Author2", LocalDate.now());
        Book book3 = new Book("Title3","Author3", LocalDate.now());
        Set<Book> books = library.getBooks();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Library shallowCloneLibrary = null;
        Library deepCloneLibrary = null;
        try{
            shallowCloneLibrary = library.shallowCopy();
            deepCloneLibrary = library.deepCopy();
        }
        catch(CloneNotSupportedException e){
            System.out.println(e);
        }
        books.remove(book3);
        Assert.assertEquals(2,books.size());
        Assert.assertEquals(2,shallowCloneLibrary.getBooks().size());
        Assert.assertEquals(3,deepCloneLibrary.getBooks().size());
    }
}
