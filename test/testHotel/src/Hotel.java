// Create a class called “Hotel” which contains the following:
//Private Data Members:
//1. Rno(Data member to store Room No)
//2. Name(Data member to store customer name)
//3. Tarrif(Data member to store per day charges)
//4. Days(Number of days of stay)
//Member Function:
//1. Calculate( ) // A function to calculate and return the amount
//2. Formula: days*tarrif.
//Public Members:
//1. Check-in () // A function to enter Rno, Name, tariff and days
//2. Display( ) // A function to display Rno, Name, Tarrif, days and
//3. Total amount as per the Calculate () function
//Instantiate the class and write the main function as needed.
import java.util.Scanner;

public class Hotel {
	
	private int Rno;
	private String Name;
	 private final double Tarrif = 1000;
	private int Days;
	
	
	public void Checkin(int Rno , String Name , int Days) {
		this.Rno = Rno;
		this.Name = Name;
		this.Days = Days;
	}
	
	public double Calculate() {
		return Days * Tarrif;
	}
	
	private void Display() {
		System.out.println("Room No: " + Rno);
        System.out.println("Customer Name: " + Name);
        System.out.println("Tarrif per day: Rs" + Tarrif);
        System.out.println("Number of days stayed: " + Days);
        System.out.println("Total amount: Rs " + Calculate());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Hotel h = new Hotel();
		
		System.out.println("Enter details for check-in:");
		System.out.print("Room No: ");
		int rno = sc.nextInt();
		System.out.print("Customer Name: ");
		String name = sc.next();
		System.out.print("Number of days stayed: ");
		 int days = sc.nextInt();
		 
		 h.Checkin(rno, name, days);
		 System.out.println("\nDetails of the stay:");
		 h.Display();

	}

}
