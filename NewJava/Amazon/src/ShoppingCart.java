import Package1.Item;
import Package3.Supplier;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Adding sample items
        itemList.add(new Item("I001", "T-shirt", "Apparel", 25.0, 50, "M001", "Manufacturer1", "City1", 4, 0.1, 0.05, new Supplier("S001", "Supplier1", "1234567890", "supplier1@example.com", "Local")));
        itemList.add(new Item("I002", "Mobile Phone", "Electronic", 500.0, 30, "M002", "Manufacturer2", "City2", 3, 0.05, 0.1, new Supplier("S002", "Supplier2", "9876543210", "supplier2@example.com", "Premium")));

        System.out.println("Enter Manufacturer Name: ");
        String manufacturerName = scanner.nextLine();
        System.out.println("Enter Supplier Category: ");
        String supplierCategory = scanner.nextLine();

        boolean found = false;

        for (Item item : itemList) {
            if (item.getManufacturerName().equalsIgnoreCase(manufacturerName) && item.getSupplier().getSupplierCategory().equalsIgnoreCase(supplierCategory)) {
                found = true;
                System.out.println("Item Found:");
                displayItemDetails(item);
                System.out.println("Enter the number of items required: ");
                int quantity = scanner.nextInt();

                if (quantity <= item.getStockPosition()) {
                    double totalPrice = calculateTotalPrice(item, quantity);
                    System.out.println("Total Cost with Discount: $" + totalPrice);
                } else {
                    System.out.println("Required items not in stock.");
                }

                break;
            }
        }

        if (!found) {
            System.out.println("Items with specified manufacturer name and supplier category not found.");
        }
    }

    private static void displayItemDetails(Item item) {
        System.out.println("Item Code: " + item.getItemCode());
        System.out.println("Item Name: " + item.getItemName());
        System.out.println("Item Category: " + item.getItemCategory());
        System.out.println("Price: $" + item.getPrice());
        System.out.println("Stock Position: " + item.getStockPosition());
        System.out.println("Manufacturer: " + item.getManufacturerName());
        System.out.println("Supplier: " + item.getSupplier().getSupplierName());
        System.out.println("Contact Number: " + item.getSupplier().getContactNumber());
        System.out.println("Email ID: " + item.getSupplier().getEmailId());
    }

    private static double calculateTotalPrice(Item item, int quantity) {
        double discount;
        if (item.getItemCategory().equalsIgnoreCase("Apparel")) {
            discount = item.getApparelDiscount();
        } else if (item.getItemCategory().equalsIgnoreCase("Electronic")) {
            discount = item.getElectronicDiscount();
        } else {
            discount = 0.0;
        }

        double totalPrice = quantity * item.getPrice() * (1 - discount);
        return totalPrice;
    }
}
