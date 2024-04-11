//Write a program that define class student, in which put fields like student
//id,name,semester and marks of minimum 5 subjects, and perform following operations:
//1.Insert values for five students through function. (Create 5 objects)
//2.Calculate percentage and grade, if student is fail in any subject then grade is F and
//if he/she is pass then criteria for grade is as follows:
//a. if per >=70 grade is A
//b. if per >=60 and <70 then grade is B
//c. if per >=50 and <60 then grade is C
//d. Otherwise D.
//3.Display student result in mark sheet like format.

import java.util.Scanner;
public class Student {

	// value levani 
	private int sid ;
	private String sname;
	private int sem;
	private int[] marks = new int[5];
	
	//Constructor 

public Student (int sid , String sname , int sem , int[] marks) {
		this.sid = sid;
		this.sname = sname;
		this.sem = sem;
		this.marks = marks;
	}
	
	public void CalGrade()
	{
		double pr = calPr();
		char grade;
		
		if(pr >= 70 ) {
			grade = 'A';
		}else if(pr >= 60) {
			grade = 'B';
		}else if(pr >= 50) {
			grade = 'C';
		}else {
			grade = 'D';
		}
		System.out.println("Grade : " + grade);
	}
	
	private double calPr() {
		double totalmakr = 0;
		for (int mark : marks) {
			totalmakr += mark;
		}
		double percentage = (totalmakr / (marks.length * 100)) * 100;
	    System.out.println("Percentage: " + percentage);
	    return percentage;
	}
	
	public void display() {
		System.out.println("Student ID: " + sid);
        System.out.println("Name: " + sname);
        System.out.println("Semester: " + sem);
        System.out.println("Marks:");
		for (int i=0; i < marks.length; i++) {
			System.out.println("Subject " + (i + 1)+ " : " + marks[i]);
		}
		CalGrade();
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] students = new Student[5];
		
//		for (int i=0 ; i < 5 ; i ++) {
//			System.out.println("Enter details for student " + (i + 1) + " : ");
//			System.out.println("ID : ");
//			int sid = sc.nextInt();
//			System.out.println("Name : ");
//			String sname = sc.next();
//			System.out.print("Semester: ");
//            int semester = sc.nextInt();
//            int[] marks = new int[5];
//            for (int j=0; j<5; j++) {
//            	System.out.print("Enter marks for subject " + (j + 1) + ": ");
//                marks[j] = sc.nextInt();
//            }
//            students[i] = new Student(sid, sname, semester, marks);
//		}
		
//		for(Student student : students) {
//			System.out.println("--------------------");
//			 System.out.println("\nMark Sheet:");
//			 student.display();
//		}

		System.out.println("Enter details for student : ");
		System.out.println("ID : ");
		int sid = sc.nextInt();
		System.out.println("Name : ");
		String sname = sc.next();
		System.out.print("Semester: ");
        int semester = sc.nextInt();
        int[] marks = new int[5];
        for (int j=0; j<5; j++) {
        	System.out.print("Enter marks for subject " + (j + 1) + ": ");
            marks[j] = sc.nextInt();
        }
       
	
		// display
		Student st = new Student(sid, sname, semester, marks);
			System.out.println("--------------------");
			 System.out.println("\nMark Sheet:");
			 st.display();
		
	}

}
