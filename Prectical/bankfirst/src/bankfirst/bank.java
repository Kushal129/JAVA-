//1. Create a class to represent a bank account, including following members:
// Data Members:
//1. Account number
//2. Name of the depositor
//3. Type of account (i.e. Savings/Current)
//4. Balance amount in the account
// Member Functions:
//1. To assign initial value
//2. To deposit an amount
//3. To withdraw an amount after checking minimum balance (minimum balance is 500)
//4. To display the name and balance


package bankfirst;

import java.util.Scanner;

public class bank {
	//Data members 
	private int accnumber;
	private String deponame;
	private String actype;
	private double balance;
	
	//The members Functions
	
	public void initializeAccount (int accnumber, String deponame , String actype , double balance  ) {
		this.accnumber = accnumber;
		this.deponame = deponame;
		this.actype = actype;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if (amount > 0 ) {
			balance += amount;
			System.out.println("Deposit successful. New balance: " + balance);
		}else {
			System.out.println("Invalid Deposit Amount");
		}
	}
	
	public void withdraw(double amount) {
		if (amount > 0) {
			if (balance - amount >= 500) {
				balance -= amount;
				System.out.println("Withdrawal successful. New balance: " + balance);
			} else {
				System.out.println("Insufficient funds. Minimum balance should be 500.");
			}
		} else {
			System.out.println("Invalid withdrawal amount.");
		}
	}
	
	
	public void display() {
		System.out.println("Account Holder : " + deponame);
		System.out.println("Current Balance : " + balance);
	}
	public static void main(String[] args) {
		
		// Scanner no obj banavo for the input form user
		Scanner sc = new Scanner(System.in);
		
		bank myb = new bank();
		
		// get values 
		System.out.println("Enter Account Number: ");
		int accnumber = sc.nextInt();
		
		System.out.print("Enter Depositor Name: ");
		String deponame =  sc.next();
		
		System.out.print("Enter Account Type (Savings/Current): ");
        String actype = sc.next();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        
        //Initializing karvanu input nu 
        
        myb.initializeAccount(accnumber, deponame, actype, balance);
        
        // value display 
        
        myb.display();
        
        // vaivat karvano 
        
        System.out.println("Enter Deposit Amount");
        double amount = sc.nextDouble();
        myb.deposit(amount);
        
        System.out.println("Enter Withdrawal Amount");
        double withamount = sc.nextDouble();
        myb.withdraw(withamount);
        
        // Displaying updated details
        myb.display();
        
        sc.close();		}

}
