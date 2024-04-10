package ShoppingCartDemo;

import java.util.*;

class ShoppingCart {
	static int totalItemsPurchased = 0;
	private ArrayList<String> itemList;
	private ArrayList<Double> itemPrices;

	public ShoppingCart() {
		this.itemList = new ArrayList<>();
		this.itemPrices = new ArrayList<>();
		totalItemsPurchased = 0;
	}

	public void additem(String itemName, double itemPrice) {
		itemList.addLast(itemName);
		itemPrices.add(itemPrice);
		totalItemsPurchased++;
	}

	public void display() {
		System.out.println("Items In The Cart");
		for (int i = 0; i < itemList.size(); i++) {
			System.out.println("- " + itemList.get(i) + " [ " + itemPrices.get(i) + "Rs" + " ]");
		}
	}
	
	public void bill() {
		System.out.println("Billing Details: ");
		display();
		double totalCost = 0;
		for (double price : itemPrices) {
			totalCost += price;
		}

		System.out.println("Total Number of Items Purchased: " + totalItemsPurchased);
		System.out.println("Total Cost: " + totalCost + "Rs");
	}
}
public class ShoppingCartDemo {

	public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Shopping Cart!");

        if (ShoppingCart.totalItemsPurchased == 0) {
            System.out.println("It looks like you are shopping for the first time.");
        }

        while (true) {
            System.out.print("Enter the name of the item to add to the cart (or 'exit' to finish): ");
            String itemName = sc.nextLine();

            if (itemName.equalsIgnoreCase("exit")) {
				break;
            }

			System.out.print("Enter the price of the item: Rs. ");
            double itemPrice = sc.nextDouble();
			sc.nextLine();

            cart.additem(itemName, itemPrice);
            System.out.println(itemName + " has been added to the cart.");
        }

        System.out.println("\nGenerating Bill...");
        cart.bill();
        sc.close();
	}
}

