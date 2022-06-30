package flowcontrols;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * wap to check if the year is leap or not
		 */

		// Get the year from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		if (num % 4 == 0)
			System.out.println("It's a leap year");
		else
			System.out.println("It is not a leap year");
	}

}

