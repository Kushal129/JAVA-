import java.util.Scanner;

public class Library {
	
	Scanner sc = new Scanner(System.in);
	
	public void MemberDetail() {
		 System.out.println("Functionality for managing member details.");

	        System.out.println("1. Add new member");
	        System.out.println("2. View member information");
	        System.out.println("3. Update member details");
	        System.out.println("4. Delete member");
	        System.out.println("======================================");
	}
	public void BookDetail() {
		 System.out.println("Functionality for managing book details.");

	        System.out.println("1. Add new book");
	        System.out.println("2. View book information");
	        System.out.println("3. Update book details");
	        System.out.println("4. Delete book");
	        System.out.println("======================================");
	        
	}
	public static void main(String[] args) {
		Library lb = new Library();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n Library Management System");
			System.out.println("1. Member Detail");
            System.out.println("2. Book Detail");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
			case 1:
				lb.MemberDetail();
				break;
			case 2:
				lb.BookDetail();
				break;
			case 3:
                System.out.println("Exiting...");
                break;	
			default:
				  System.out.println("Invalid choice! Please enter a valid option.");
            }
		}while(choice !=3 );

	}

}
