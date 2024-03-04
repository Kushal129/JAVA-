package BookShop;

import java.util.Scanner;

class Books {
	String booktitle;
	String author;
	double price;
	String publisher;
	int stockPosition;
	
	public Books(String title, String author, double price, String publisher, int stock) {
		this.booktitle = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.stockPosition = stock;
	}

	public void displaybooks() {
		System.out.println("Book Title: " + booktitle);
		System.out.println("Auther: " + author);
		System.out.println("Price: " + price);
		System.out.println("Publisher" + publisher);
		System.out.println("Stocks " + stockPosition);
	}

	public void Purchase(int reqcopi) {
		if (reqcopi > stockPosition) {
			System.out.println("Required copies not in stock.");
		} else {
			double totalcost = price * reqcopi;
			System.out.println("Book available! Total Cost: " + totalcost);
			stockPosition -= reqcopi;
			System.out.println("Remaning Stock: " + stockPosition);
		}
	}
}

public class BookShop {

	public static void main(String[] args) {
		Books book1 = new Books("the marvel", "LEO Iron", 1200, "ALL About The Marvels ", 8);
		Books book2 = new Books("the Jook", "BB optical", 22000, "The Life Opticals  ", 16);

		
		System.out.println("Book Details: ");
		book1.displaybooks();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of copies you want to purchase: ");
		int requestcopis = sc.nextInt();

		book1.Purchase(requestcopis);
		sc.close();

	}
}

