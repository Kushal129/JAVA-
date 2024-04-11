import java.util.Scanner;

public class Customer {

	private int customerId;
	private String customerName;
    private String city;
    private String contactNo;
    private double[] purchases = new double[5];
	
    
    // initialize customer
    
    public Customer ( int customerId, String customerName, String city , String contactNo , double[] purchases) {
    	this.customerId = customerId;
        this.customerName = customerName;
        this.city = city;
        this.contactNo = contactNo;
        this.purchases = purchases;
    }
    
    
    public void Display() {
    	 System.out.println("Customer ID: " + customerId);
         System.out.println("Customer Name: " + customerName);
         System.out.println("City: " + city);
         System.out.println("Contact No: " + contactNo);
         System.out.println("Last Five Purchases: ");
         for (int i=0; i<purchases.length; i++) {
        	 System.out.println("Purchase " + (i + 1) + ": " + purchases[i]);
         }
	}
    
    public double calAvgPurchase() {
		double totalPur = 0;
		for (double purchase : purchases) {
			totalPur += purchase;
		}
		return totalPur / purchases.length;
	}
    
    public double calculateDiscount() {
		double avgPur = calAvgPurchase();
		if (avgPur > 50000) {
			 return 5000;
		}else if (avgPur > 35000) {
            return 3500;
        } else if (avgPur > 20000) {
            return 2000;
        } else {
            return 0;
        }
	}
    
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer details:");
        System.out.print("Customer ID: ");
        int customerId = sc.nextInt();
        System.out.print("Customer Name: ");
        String customerName = sc.next();
        System.out.print("City: ");
        String city = sc.next();
        System.out.print("Contact No: ");
        String contactNo = sc.next();
		double[] purs = new double[5];
		 System.out.println("Enter last five purchases:");
		 for (int i=0; i<5 ; i++) {
			 System.out.println("Purchase " + (i+1)+ " : ");
			 purs[i]= sc.nextDouble();
		 }
		 
		 // Customer obj
		 
		 Customer cs = new Customer(customerId, customerName, city, contactNo, purs);
		 
		 System.out.println("\n Customer Data:");
		 cs.Display();
		 
		 //cal avg and dic
		 
		 double avgpur = cs.calAvgPurchase();
		 double dis = cs.calculateDiscount();
		 System.out.println("\nAverage Purchase: " + avgpur);
		 System.out.println("Discount Earned: " + dis);
		 
	}

}
