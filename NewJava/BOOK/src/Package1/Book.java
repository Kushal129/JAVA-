package Package1;

import Package2.Concession;

public class Book extends Publisher implements Concession {
    private String title;
    private String ISBN;
    private int numPages;
    public double price;
    public int stockPosition;
    private double discount;
    public Author author;

    public Book(String title, String ISBN, int numPages, double price, int stockPosition, String publisherId, String publisherName, String publisherCity, int rating, double discount, Author author) {
        super(publisherId, publisherName, publisherCity, rating);
        this.title = title;
        this.ISBN = ISBN;
        this.numPages = numPages;
        this.price = price;
        this.stockPosition = stockPosition;
        this.discount = discount;
        this.author = author;
    }

    @Override
    public double getDiscount() {
        return discount;
    }

    public void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Number of Pages: " + numPages);
        System.out.println("Price: $" + price);
        System.out.println("Stock Position: " + stockPosition);
        System.out.println("Publisher: " + getPublisherName());
        System.out.println("Author: " + author.getAuthorName());
        System.out.println("Contact Number: " + author.getContactNumber());
        System.out.println("Email ID: " + author.getEmailId());
        System.out.println("Book Category: " + author.getBookCategory());
    }
}
