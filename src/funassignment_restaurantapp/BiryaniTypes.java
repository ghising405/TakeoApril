package funassignment_restaurantapp;

import java.util.Scanner;

public class BiryaniTypes {

	Scanner sc = new Scanner(System.in);
	int price;
	int qty;
	static int chicken_total;
	static int veg_total;
	static int fish_total;
	static int biryani_total;

	// 2.here we will details about each type of biryani

	// details about chickenBn
	void chickenBn() {
		System.out.println("This is chicken biryani. Please enjoy!!");
		price = 20;
		System.out.println("How many plates Chicken Biryani would you want?");
		qty = sc.nextInt();
		chicken_total = price * qty;
		System.out.println("The total bill for Chicken Biryani is : " + chicken_total + "$");
	}

	// details about VegBn
	void vegBn() {
		System.out.println("This is veg biryani. Please enjoy");
		price = 10;
		System.out.println("How many plates Vegetable Biryani would you want?");
		qty = sc.nextInt();
		veg_total = price * qty;
		System.out.println("The total bill for Veg-Biryani is: " + veg_total + "$");
	}

	// details about FishBn
	void fishBn() {
		System.out.println("This is fish biryani. Please enjoy");
		price = 30;
		System.out.println("How many plates of Fish-Biryani would you want?");
		qty = sc.nextInt();
		fish_total = price * qty;
		System.out.println("The total bill for Fish-Biryani is : " + fish_total + "$");
	}

	static void biryani_totalBill() {
		biryani_total = chicken_total + veg_total + fish_total;
		if (biryani_total != 0)
			System.out.println("The total bill for Biryani is : " + biryani_total + "$");
	}

	public void biryanidetails() // here we will have all the details about all the biryanis
	{
		// TODO Auto-generated method stub

		System.out.println("*************************************************");
		System.out.println("                1.ChickenBn - 20$                ");
		System.out.println("                2.VegBn     - 10$                ");
		System.out.println("                3.FishBn    - 30$                ");
		System.out.println("                4.Back                           ");
		System.out.println("*************************************************");

		// 1.we will ask the user to enter the choices from 1 to 4
		System.out.println("Enter your choice of Biryani");
		int choice = sc.nextInt();

		switch (choice) // from here you can switch from one option to another. meaning you can choose
						// anything
		{
		case 1: // call the method here - chickenBn
			chickenBn(); // non-static to non-static ---> you can call directly
			// after the execution of "This is chicken biryani. Please enjoy!!", we want to
			// display same page again so we will call the meethod:
			biryanidetails();
			break;

		case 2:
			vegBn();
			biryanidetails();
			break;

		case 3:
			fishBn();
			biryanidetails();
			break;

		case 4: // here we are going back i.e. main(). And you can call main method using class
				// name
			RestaurantApp.main(null);

		default:
			System.out.println("Please enter choice from 1 to 4");

		}

	}

}
