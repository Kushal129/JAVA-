import java.util.Scanner;

class condition {
    public static void main(String[] args) {

        //**********         if else          *************
        // int pwd;
        // System.out.println("Enter Password:- " );
        // Scanner sc = new Scanner(System.in);
        // pwd=sc.nextInt();
        // if(pwd == 5252){
        //     System.out.println("Open Succesfull...");
        //     System.out.println("Kushal Pipaliya");
        //     System.out.println("Age : 20 ");
        // }else{
        // System.out.println("No Sorry Wrong Password....");
        // }

        
        //**********         Else if          *************

        // int marks;
        // System.out.println("Enter Marks:-  ");
        // Scanner sc = new Scanner(System.in);
        // marks = sc.nextInt();
        // if(marks >= 60 && marks<=100){
        //     System.out.println("A+ Grade");
        // }
        // else if(marks >=45 && marks <=60){
        //     System.out.println("B+ Grade");
        // }
        // else if(marks >=33 && marks <=45){
        //     System.out.println("C+ Grade");
        // }
        // else{
        //     System.out.println("F++ ");
        // }

        //**********         nested if else        *************

        // int num1 = 20;
        // int num2 = 30;
        // int num3 = 40;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Num 2");
        int num2 = sc.nextInt();
        System.out.println("Enter Num 3");
        int num3 = sc.nextInt();

        if(num1 > num2)
        {
            if(num1 > num3) 
            {
                System.out.println("Maximum Number :- "+ num1);
            }
            else
            {
                System.out.println("Maximum Number :- "+ num3);
            }
        }
        else{
            if(num2 > num3) 
            {                                
                System.out.println("Maximum Number :- "+ num2);

            }
            else
            {
                System.out.println("Maximum Number :- "+ num3);
            }
        }



    }
}
