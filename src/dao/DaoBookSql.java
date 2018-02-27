package dao;

import model.Author;
import model.Book;
import model.Publisher;
import model.TypeBook;

import java.sql.Connection;
import java.util.ArrayList;

public class DaoBookSql implements DaoBook {
    @Override
    public Book addBook(String ISBN, Author author, String title, Publisher publisher, int publicationYear, float price, TypeBook typeBook) {
        return null;
    }

    @Override
    public void editBook(String columnName, String bookData) {

    }

    @Override
    public void deleteBook(String ISBN) {

    }

    @Override
    public ArrayList<Book> advancedSearch(String phrase) {
        return null;
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        DBConnection dbConnection = DBConnection.getInstance();
        Connection connection = dbConnection.getConnection();

    }

    @Override
    public ArrayList<Book> getAllBooksOfGivenAuthor(Author author) {
        return null;
    }
}
