package model;


public class Book {
    private String ISBN;
    private Author author;
    private String title;
    private Publisher publisher;
    private int publicationYear;
    private float price;
    private TypeBook bookType;

    public Book(String ISBN, Author author, String title, Publisher publisher, int publicationYear, float price, TypeBook bookType) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.price = price;
        this.bookType = bookType;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public TypeBook getBookType() {
        return bookType;
    }

    public void setBookType(TypeBook bookType) {
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return String.format(
                "Book: Title: %s, %d,Price: %.2f, ISBN: %s\n" +
                        "%s\n%s\n%s",
                title, publicationYear, price, ISBN,
                author, publisher, bookType);
    }
}
