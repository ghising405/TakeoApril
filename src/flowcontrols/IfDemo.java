package flowcontrols;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * If the age is above 18, he is a major. else he is a minor
		 */

		// we want user to enter their age
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int num = sc.nextInt();

		if (num > 18)
			System.out.println("He is a major");
		else
			System.out.println("He is a minor");

	}

}
