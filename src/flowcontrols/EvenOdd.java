package flowcontrols;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * wap to see if the the given number is odd or even. even = number%2=0. else
		 * odd
		 */

		// get the number from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		if (num % 2 == 0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
	}

}
