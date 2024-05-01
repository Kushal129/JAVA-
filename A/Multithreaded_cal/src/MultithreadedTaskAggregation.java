import java.util.Scanner;

class MultiplTh extends Thread
{
	private int num;
	
	public MultiplTh(int nun) {
		this.num = nun;
	}
	
	public void run() {
		 int rs = 1;
		    while (num != 0) {
		        int digit = num % 10; //remainder
		        rs *= digit;
		        num /= 10; // remove last digits
		    }
		System.out.println("Multiplication Result: " + rs);
	}
	
//	In the first iteration of the loop:
//		digit will be 123 % 10, which is 3.
//		rs will be multiplied by 3, so rs becomes 1 * 3 = 3.
//		num will be divided by 10, so num becomes 123 / 10 = 12.
	
	
//	In the second iteration of the loop:
//		digit will be 12 % 10, which is 2.
//		rs will be multiplied by 2, so rs becomes 3 * 2 = 6.
//		num will be divided by 10, so num becomes 12 / 10 = 1.

	
//	In the third iteration of the loop:
//		digit will be 1 % 10, which is 1.
//		rs will be multiplied by 1, so rs becomes 6 * 1 = 6.
//		num will be divided by 10, so num becomes 1 / 10 = 0
}


class CubrTh extends Thread{
	private int num;
	
	public CubrTh(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		int rs = 0;
		while(num > 0) {
			int digit = num % 10;
			rs += Math.pow(digit, 3);
//			Math.pow(base, exponent)
			num /= 10;
		}
		System.out.println("Cube Each Result: " + rs);
	}
//	
//	First Iteration:
//		digit = num % 10 = 129 %(/) 10 = 9
//		Math.pow(9, 3) = 9 * 9 * 9 = 729
//		rs += 729 = 729
//		num /= 10 = 129 / 10 = 12
	
//	Second Iteration:
//		digit = num % 10 = 12 % 10 = 2
//		Math.pow(2, 3) = 2 * 2 * 2 = 8
//		rs += 8 = 729 + 8 = 737
//		num /= 10 = 12 / 10 = 1
//	
//	Third Iteration:
//		digit = num % 10 = 1 % 10 = 1
//		Math.pow(1, 3) = 1 * 1 * 1 = 1
//		rs += 1 = 737 + 1 = 738
//		num /= 10 = 1 / 10 = 0
}


class Factorial extends Thread{
	private int num ;
	
	public Factorial(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		long rs = 1;
		for (int i = 1; i <= num; i++) {
		    rs *= i;
		    System.out.println("i = " + i + ": " + rs);
		}
		System.out.println("Factorial Result: " + rs);
	}
}
public class MultithreadedTaskAggregation {

	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Number");
		 int num = sc.nextInt();
		 
		 MultiplTh mt = new MultiplTh(num);
		 CubrTh cb = new CubrTh(num);
		 Factorial f = new Factorial(num);
		 
		 mt.start();
		 cb.start();
		 f.start();
	}

}
