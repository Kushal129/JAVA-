import java.util.Scanner;

public class AgeValidation {

	public static void main(String[] args) {
		try {
			int age = getUser();
			if(age > 18 ) {
				System.out.println("Valid age");
			}else {
				throw new InvalidAgeException("Errro : Age Must be 18");
			}
		}catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
	static int getUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		return age;
	}
}
class InvalidAgeException extends Exception 
{
	public InvalidAgeException(String msg) {
		super(msg);
	}
};