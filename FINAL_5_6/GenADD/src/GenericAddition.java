import java.util.Scanner;

public class GenericAddition<T extends Number> {

	T num1;
	T num2;
	
	private GenericAddition(T num1 , T num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public T add() {
		if(num1 instanceof Integer) {
			return (T)Integer.valueOf(num1.intValue() + num2.intValue());
		} else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else if (num1 instanceof Float) {
            return (T) Float.valueOf(num1.floatValue() + num2.floatValue());
        } else if (num1 instanceof Long) {
            return (T) Long.valueOf(num1.longValue() + num2.longValue());
        } else {
            throw new IllegalArgumentException("Unsupported data type");
        }
	}
	
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 number: ");
		double num1 = sc.nextDouble();
		System.out.println("Enter num2 number: ");
		double num2 = sc.nextDouble();
		
		GenericAddition<Double> gn = new GenericAddition<>(num1, num2);
		System.out.println("Sum is :- " + gn.add());
		
		sc.close();
		}catch (Exception e) {
			System.out.println("Error: Please enter valid input.");
		}
	}

}
