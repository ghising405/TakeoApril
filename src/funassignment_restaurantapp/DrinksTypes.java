package funassignment_restaurantapp;

import java.util.Scanner;

public class DrinksTypes {

	static int drink_total;

	Scanner sc = new Scanner(System.in);

	static void drinks_totalBill() {
		drink_total = SoftDrinksTypes.softdrink_total + HotDrinkTypes.hotdrink_total;
		if (drink_total != 0)
			System.out.println("The total bill for Drinks is : " + drink_total + "$");
	}

	public void drinkDetails() {
		System.out.println("*********************************************");
		System.out.println("            1.SoftDrinks                     ");
		System.out.println("            2.HotDrinks                      ");
		System.out.println("            3.Back                           ");
		System.out.println("*********************************************");

		// 1.we want user to enter their choice
		System.out.println("Please enter your choice!!");
		int choice = sc.nextInt();

		switch (choice) {
		case 1: // we want specific drink related details. so create method
			// call method for softdrinks
			SoftDrinksTypes softDetails = new SoftDrinksTypes();
			softDetails.softDrinkDetails();
			drinkDetails(); // we want to display this page again
			break;

		case 2:
			// call method for hotdrinks. created another class
			HotDrinkTypes hotdetail = new HotDrinkTypes();
			hotdetail.hotDrinkDetails();
			drinkDetails(); // after execution of hot drinks we want to show these details
			break;

		case 3:
			// going back to main method (main page / main menu)
			RestaurantApp.main(null);

		}

	}

}
