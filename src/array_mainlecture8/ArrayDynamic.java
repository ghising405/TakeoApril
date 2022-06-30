package array_mainlecture8;

import java.util.Scanner;

public class ArrayDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.declaring array
		int ar[] = new int[3];

		// Now, I want to 1. read the data dynamically, 2. store inside the array and
		// 3.display it.

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < ar.length; ++i) {
			System.out.println("Enter the number"); // the user will enter the values in the index
			ar[i] = sc.nextInt(); // reading and storing inside the array
		}

		System.out.println("----------------------------------------------------");

		// now display the data or values in index on the console from array
		for (int j : ar) {
			System.out.print(j + " "); // this will display the values in the index the user just entered.
			// printing / displaying in single line
		}

		// Therefore, this is how we can read data dynamically, store in array and
		// display in console.

	}

}
