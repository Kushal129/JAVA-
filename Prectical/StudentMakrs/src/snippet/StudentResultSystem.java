package snippet;

import java.util.Scanner;

class Student {
	int studentId;
	String name;
	int semester;
	int[] marks = new int[5];
	double percentage;
	char grade;

	// Insert value for Student

	void insertValues(int id, String studentName, int sem, int[] subjectMarks) {
		studentId = id;
		name = studentName;
		semester = sem;
		marks = subjectMarks;
	}

//	public void calculate() {
//		double totalmarks = 0;
//		for(int i=0; i<5; i++) {
//			totalmarks += marks[i];
//		}
//		percentage = (totalmarks*100)/500;
//	}

	void calculateResult() {
		int totalMarks = 0;
		for (int mark : marks) {
			totalMarks += mark;
		}

		percentage = (double) totalMarks / marks.length;

		if (percentage >= 70) {
			grade = 'A';
		} else if (percentage >= 60) {
			grade = 'B';
		} else if (percentage >= 50) {
			grade = 'C';
		} else {
			grade = 'D';
		}
	}

	void display() {
		System.out.println("------------------------------");
		System.out.println("Student ID: " + studentId);
		System.out.println("Name: " + name);
		System.out.println("Semester: " + semester);
		System.out.println("Marks:");
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Subject " + (i + 1) + ": " + marks[i]);
		}
		System.out.println("Percentage: " + percentage);
		System.out.println("Grade: " + grade);
		System.out.println("------------------------------");
	}
}

public class StudentResultSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Student student = new Student();

		System.out.println("Enter details for Student :");
		System.out.print("Student ID: ");
		int id = scanner.nextInt();

		System.out.print("Name: ");
		String name = scanner.next();

		System.out.print("Semester: (eg.1) ");
		int semester = scanner.nextInt();

		int[] marks = new int[5];
		System.out.println("Enter marks for 5 subjects:");
		for (int j = 0; j < 5; j++) {
			System.out.print("Subject " + (j + 1) + ": ");
			marks[j] = scanner.nextInt();
		}

		student.insertValues(id, name, semester, marks);
		student.calculateResult();
		student.display();

		scanner.close();
	}

}
