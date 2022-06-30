package flowcontrols;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Blood donation: check if the person is major and minor. If major he can
		 * donate the blood. further check if the weight is above 40 or not. If weight
		 * is above 40 he can donate, otherwise he cannot. And if he is minor, else part
		 * executes.
		 */

		// get the age from the donor
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = sc.nextInt();

		// check the age and see if the donor qualifies
		if (age > 18) {
			System.out.println("He is a major");
			// check the weight. ask to enter weight
			System.out.println("Enter the weight");
			int weight = sc.nextInt();
			if (weight > 40)
				System.out.println("He/She can donate the blood");
			else
				System.out.println("Underweight cannot donate the blood");

		} // end of if
		else
			System.out.println("He/ She is a minor");
	}

}
