package flowcontrols;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * we need to display number from 1 to 10. or a user enters a number and we need
		 * to iterate that number
		 */

		// get the number from user.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt(); // example user enters 10 i.e. num=10

		// now iterate (repeat) the process using for loop
		for (int i = 1; i <= num; ++i) {
			System.out.println(i);
		}
	}

}
