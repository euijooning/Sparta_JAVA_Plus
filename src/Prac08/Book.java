package Prac08;

public class Book {
    public String title;
    public String author;
    public String publisher;
    public int price;

    public Book() {
    }
    public Book(String title, String author, String publisher, int price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle(String title) {
        return this.title = title;
    }

    public String getAuthor(String author) {
        return this.author = author;
    }

    public String getPublisher(String publisher) {
        return this.publisher = publisher;
    }

    public int getPrice(int price) {
        return this.price = price;
    }
}
