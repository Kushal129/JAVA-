
import java.util.Scanner;
class Addition {
   public static void main(String[] args) {
      int a,b,c;
      System.out.println("Enter Number");
      Scanner s = new Scanner(System.in);

      a = s.nextInt();
      b = s.nextInt();
      c = a+b;
      System.out.println("Sum Of Two Number" + "  " + c) ;
   }
}
