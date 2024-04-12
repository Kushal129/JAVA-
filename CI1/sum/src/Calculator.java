import java.util.Scanner;

// if jo bija class mathi kidhu hoi to CalInterface.java 
//	eni under interface cal { int add(int a , int b ) and ..}
// aaya import CalInterface; karvai ne baki nu impli sem

interface Cal{
	int add(int a , int b);
	int sub(int a , int b);
}

class Calculator implements Cal{

	@Override 
	public int add(int a, int b) {
		return a + b;
	}
	
	@Override 
	public int sub(int a, int b) {
		return a - b;
	}
	
	public static void main(String[] args) {
		
		Calculator cs = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A value : ");
		int a = sc.nextInt();
		System.out.println("Enter B value : ");
		int b = sc.nextInt();
		
		int addR = cs.add(a, b);
		int SubR = cs.sub(a,b);
		System.out.println("Addition is " + addR);
		System.out.println("Sub is " + SubR);
		
		sc.close();
	}

}
