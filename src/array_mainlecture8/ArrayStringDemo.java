package array_mainlecture8;

import java.util.Scanner;

public class ArrayStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. declaring array
		String ar[] = new String[3];

		// reading data dynamically, storing in array and displaying in console.

		// Reading dynamically
		Scanner sc = new Scanner(System.in);
		// we have to read / enter data repeatedly so using for loop
		for (int i = 0; i < ar.length; ++i) {  //i points to the index.
			System.out.println("Enter the Index Value");
			ar[i] = sc.next(); // reading (user enters the value) and storing value in index
		}

		System.out.println("------------------------------------");

		// Display in console and for that we can use for each
		for (String j : ar) {
			System.out.println(j); //j points directly to the index value.
		} 

		// therefore, this is how we can read data dynamically, store in array and
		// display in console.
	}

}
