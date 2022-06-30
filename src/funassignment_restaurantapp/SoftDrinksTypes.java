package funassignment_restaurantapp;

import java.util.Scanner;

public class SoftDrinksTypes {

	Scanner sc = new Scanner(System.in);
	int price;
	int qty;
	int sprite_total;
	int thumbs_total; 
	static int softdrink_total; //variable softdrink_total can  be accessed  anywhere using classname

	void sprite() {
		System.out.println("Beat the heat with sprite.");
		price = 5;
		System.out.println("How many Sprites would you want?");
		qty = sc.nextInt();
		sprite_total = price * qty;
		softdrink_total = sprite_total; // softdrink_total = sprite_total
		System.out.println("Total bill for Sprite is: " + sprite_total + "$");
	}

	void thumbsUp() {
		System.out.println("Taste the thumbsup");
		price = 5;
		System.out.println("How many Thumbs-up would you want?");
		qty = sc.nextInt();
		thumbs_total = price * qty;
		softdrink_total += thumbs_total; // softdrink_total = sprite_total + thumbs_total
		System.out.println("The total bill for Thumbs-up is : " + thumbs_total + "$");

	}

	static void softdrink_total() {
		//softdrink_total = sprite_total + thumbs_total;
		if (softdrink_total != 0)
			System.out.println("The total bill for soft-drink is :  " + softdrink_total + "$");
	}

	public void softDrinkDetails() {
		System.out.println("***************************************************");
		System.out.println("            1.Sprite  - 5$                         ");
		System.out.println("            2.ThumpsUp - 5$                        ");
		System.out.println("            3.Back                                 ");
		System.out.println("***************************************************");

		// 1. we want user enter the number of their choice
		System.out.println("Enter softdrinks of your choice!!");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			// create method for each of the drinks and call the method here.
			// call method for sprite
			sprite();
			softDrinkDetails(); // after calling the sprite method we want to display these optionns again
			break;

		case 2:
			// call method for thumbs-up
			thumbsUp();
			softDrinkDetails();
			break;

		case 3:
			RestaurantApp.main(null);

		}

	}

}
