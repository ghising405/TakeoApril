package flowcontrols;

import java.util.Scanner;

public class IfElseIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * get the marks from the student and tell them what is their grade.
		 */
		// get the marks from student
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int marks = sc.nextInt();

		if (marks >= 90)
			System.out.println("Your grade is A+");
		else if (marks < 90 && marks >= 80)
			System.out.println("Your grade is A");
		else if (marks < 80 && marks >= 70)
			System.out.println("Your grade is B");
		else if (marks < 70 && marks >= 60)
			System.out.println("Your grade is C");
		else if (marks < 60 && marks >= 50)
			System.out.println("Your grade is D");
		else if (marks < 50 && marks >= 35)
			System.out.println("Your grade is E");
		else
			System.out.println("Try for September!!");

	}

}
