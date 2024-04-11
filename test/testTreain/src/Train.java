import java.util.Scanner;

public class Train {

	private int trainNumber;
	private String trainName;
	private String source;
	private String destination;
	private final int s1Fair = 260;
	private final int s2Fair = 180;
	private final int s3Fair = 75;
	
	
	public Train(int trainNumber, String trainName, String source, String destination) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
	}
	
	public void Display() {
		System.out.println("Train Number: " + trainNumber);
		System.out.println("Train Name: " + trainName);
		System.out.println("Source: " + source);
		System.out.println("Destination: " + destination);
		System.out.println("Available Coaches:");
		System.out.println("1) S1 - First AC - Fair - 260 Rs.");
		System.out.println("2) S2 - Chair Car - 180 Rs.");
		System.out.println("3) S3 - Sleeper - 75 Rs.");
	}
	
	public int calTotalFair(String coach , int seats) {
		int fair = 0;
		double total = 0;
		switch (coach.toUpperCase()) {
		
		case "S1":
			fair = s1Fair;
			break;
		case "S2":
			fair = s2Fair;
			break;
		case "S3":
			fair = s3Fair;
			break;
		default:
			System.out.println("Invalid coach selection!");
		}
		System.out.println("Total Seats is  " + "[ " + seats + " ]" + " And Pr Seats Charge is " + fair);
		total =  fair * seats;
		System.out.println(total);
		return (int)total;
	}
	
	public double calSeni(double totalFair ,int seniorCitizens ) {
		return totalFair - (totalFair * 0.5 * seniorCitizens);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Train t = new Train(4152, "Express", "Surat", "Goa");
		
		t.Display();
		
		System.out.print("\nEnter coach (S1/S2/S3): ");
		String coach = sc.next();

		System.out.print("Enter number of seats: ");
        int seats = sc.nextInt();
        
        System.out.print("Enter number of senior citizens: ");
        int seniorCitizens = sc.nextInt();
        
        int totalFair = t.calTotalFair(coach, seats);
        double finalAmount = t.calSeni(totalFair, seniorCitizens);
        
        System.out.println("Total payable amount: " + finalAmount);
	}

}
