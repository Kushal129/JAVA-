import Package1.Author;
import Package1.Book;
import Package1.Publisher;

import java.util.ArrayList;
import java.util.Scanner;

public class BookInventory {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        books.add(new Book("Book1", "1234567890", 100, 150, 10, "Pub123", "Publisher1", "surat", 4, 0.1, new Author("A001", "Author1", "1234567890", "a1@google.com", "Comic")));
        books.add(new Book("Book2", "9987654321", 110, 160, 3, "Pub456", "Publisher2", "pune", 3, 0.15, new Author("A002", "Author2", "9876543210", "a2@google.com", "Fiction")));
        books.add(new Book("Book3", "12987654321", 210, 360, 5, "Pub789", "Publisher3", "goa", 3, 0.15, new Author("A003", "Author3", "1276543210", "a3@google.com", "Horror")));

        boolean Search = true;

        while (Search) {
            System.out.println("Enter Publisher Name or Enter this exit): ");
            String publisherName = scanner.nextLine();

            if (publisherName.equalsIgnoreCase("exit")) {
                Search = false;
                break;
            }

            System.out.println("Enter Book Category: ");
            String bookCategory = scanner.nextLine();

            boolean found = false;

            for (Book book : books) {
                if (book.getPublisherName().equalsIgnoreCase(publisherName) && book.author.getBookCategory().equalsIgnoreCase(bookCategory)) {
                    found = true;
                    System.out.println("Book Found:");
                    book.displayBookDetails();
                    System.out.println("Enter the number of copies you want : ");
                    int copiesRequired = scanner.nextInt();

                    if (copiesRequired <= book.stockPosition) {
                        double totalPrice = copiesRequired * book.price * (1 - book.getDiscount());
                        System.out.println("Total Cost with Discount Is : Rs" + totalPrice);
                    } else {
                        System.out.println("copies not in stock.");
                    }

                    break;
                }
            }

            if (!found) {
                System.out.println("Publisher name and category not found.");
            }

            scanner.nextLine(); 
        }

        scanner.close();
    }
}

//
//"Book1": - title of the book.
//"1234567890": - ISBN number of the book.
//100: - number of pages.
//150:- price of the book.
//10: - stock.
//"Pub123": - publisher ID.
//"Publisher1": - name of publisher.
//"surat": - publisher city .
//4: - rating of the publisher.
//0.1: Represents the discount percentage applied to the book.