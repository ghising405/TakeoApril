package funassignment_restaurantapp;

import java.util.Scanner;

public class HotDrinkTypes {

	Scanner sc = new Scanner(System.in);
	int price;
	int qty;
	int tea_total;
	int coffee_total;
	static int hotdrink_total; //variable hotdrink_total can be  accessed anywhere using classname.

	void tea() {
		System.out.println("Warm yourself with some hot tea!!");
		price = 20;
		System.out.println("How many cup of tea would you want?");
		qty = sc.nextInt();
		tea_total = price * qty;
		hotdrink_total = tea_total;  //hotdrink_total = tea_total
		System.out.println("The total bill for Tea is : " + tea_total + "$");
	}

	void coffee() {
		System.out.println("Himalayan coffee with best with Java coding");
		price = 50;
		System.out.println("How many cup of coffee would you want?");
		qty = sc.nextInt();
		coffee_total = price * qty;
		hotdrink_total+=coffee_total; //hotdrink_total = tea_total + coffee_total
		System.out.println("The total bill for Tea is : " + coffee_total + "$");
	}

	static void hotdrink_total() {
		//hotdrink_total = tea_total + coffee_total;
		if (hotdrink_total != 0)
			System.out.println("The total for hotdrink is :" + hotdrink_total + "$");

	}

	public void hotDrinkDetails() {
		System.out.println("*********************************************");
		System.out.println("            1.Tea    - 20$                         ");
		System.out.println("            2.Coffee - 50$                     ");
		System.out.println("            3.Back                           ");
		System.out.println("*********************************************");

		// we want user to enter these numbers

		System.out.println("Enter hotdrinks of your choice!!");
		int choice = sc.nextInt();

		switch (choice) {
		// write a method for each item and call it here.
		case 1: // call tea
			tea();
			hotDrinkDetails(); // after execution of tea method, we want to show these list again so calling
								// this method
			break;

		case 2:
			coffee();
			hotDrinkDetails();
			break;

		case 3:
			// we are going back to main method (main menu/ main page)
			RestaurantApp.main(null); // classname.main()
		}

	}
}
