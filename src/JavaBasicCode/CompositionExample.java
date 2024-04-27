package JavaBasicCode;

import java.util.ArrayList;
import java.util.List;

class Book{
    public String title;
    public String author;

    public Book(String title,String author){
        this.title = title;
        this.author = author;
    }
}

class Library{
    private final List<Book> books;

    public Library(List<Book> books){
        this.books = books;
    }
    // Method
    // To get total number of books in library
    public List<Book> getTotalBooksInLibrary(){
        return books;
    }

}
public class CompositionExample {
    public static void main(String[] args) {
        Book b1 = new Book("EffectiveJ Java", "Joshua Bloch");
        Book b2= new Book("Thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference","Herbert Schildt");

        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        Library library = new Library(books);
        // Calling method to get total books in library
        // and storing it in list of user defined type -
        // Books
        List<Book> bks = library.getTotalBooksInLibrary();
        for(Book bk : bks){
            System.out.println("Title : " + bk.title + " |||| " + " Author : " + bk.author);
        }

    }
}
