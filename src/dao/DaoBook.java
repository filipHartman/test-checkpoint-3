package dao;

import model.Author;
import model.Book;
import model.Publisher;
import model.TypeBook;

import java.util.ArrayList;

public interface DaoBook {
    Book addBook(String ISBN, Author author,
                 String title, Publisher publisher,
                 int publicationYear, float price, TypeBook typeBook);
    void editBook(String columnName, String bookData);
    void deleteBook(String ISBN);
    ArrayList<Book> advancedSearch(String phrase);
    ArrayList<Book> getAllBooks();
    ArrayList<Book> getAllBooksOfGivenAuthor(Author author);
}
