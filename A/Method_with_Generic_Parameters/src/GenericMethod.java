


public class GenericMethod {

	 // Method to display array elements
    public static <T> void displayArray(T[] array) {
        System.out.print("Array Elements:- ");
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
 // Method to display three generic parameters
    public static <T, U, V> void displayThreeParams(T p1, U p2, V p3) {
        System.out.println("First Parameter: " + p1);
        System.out.println("Second Parameter: " + p2);
        System.out.println("Third Parameter: " + p3);
    }

    
    public static void main(String[] args) {
        
        Integer[] intArray = {1, 2, 3, 4, 5};
        displayArray(intArray);
        
        String str = "Hello";
        Double value = 129.5;
        Character ch = 'A';
        displayThreeParams(str, value, ch);
    }

}
