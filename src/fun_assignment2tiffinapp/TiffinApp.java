package fun_assignment2tiffinapp;

import java.util.Scanner;

public class TiffinApp {
	Scanner sc = new Scanner(System.in);

	int burger_bill;
	int momo_bill;
	int chow_bill;

	// 4. creating method that has details for each product
	void burger() {
		int burger_price = 20;
		System.out.println("How many burger do you want?");
		int burg_qty = sc.nextInt();
		burger_bill = burger_price * burg_qty;
		System.out.println(burg_qty + "burger total is: " + burger_bill);
	}

	void momo() {
		int momo_price = 50;
		System.out.println("How many plates momo do you need?");
		int momo_qty = sc.nextInt();
		momo_bill = momo_price * momo_qty;
		System.out.println("The total bill for " + momo_qty + "plates of momo is: " + momo_bill);
	}

	void chowmein() {
		int chow_price = 30;
		System.out.println("How many plates chowmein do you need?");
		int chow_plate = sc.nextInt();
		chow_bill = chow_price * chow_plate;
		System.out.println("The total for " + chow_plate + "plates of chowmein is " + chow_bill);
	}

	void bill() {
		int total_bill = burger_bill + momo_bill + chow_bill;
		System.out.println("The total bill is: " + total_bill);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 5. to call the methods - burger, momo, chowmein - we create object.
		TiffinApp tiffin = new TiffinApp();

		while (true) // 1. we want to print these list every time.
		// And using only while loop this will print infinitely. So to control that we
		// will use switch
		{
			System.out.println("*****************************************");
			System.out.println("               1.Burger                  ");
			System.out.println("               2.MOMO                    ");
			System.out.println("               3.Chowmein                ");
			System.out.println("               4.Bill                    ");
			System.out.println("               5.Exit                    ");
			System.out.println("*****************************************");

			// 2.using switch case: to control the infinite execution of the loop.
			// 3.let the user enter the number of their choice and there we can apply switch
			// case
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: // if the user enters 1. then he wants burger. there we can specify the price.
					// So we need to create a method that tells those details
				// calling the burger function
				tiffin.burger();
				break;
			case 2: // create a method for momo and call the method here.
				tiffin.momo();
				break;
			case 3: // create a method for chowmein and call the method here.
				tiffin.chowmein();
				break;
			case 4: // create bill method
				tiffin.bill();
				break;
			case 5: // now exiting the application
				System.out.println("Thank you for vsiting!! Have a good day!!");
				System.exit(0);
			default: // this executes in case the user enters other numbers that is not in the list
						// of choice
				System.out.println("Please enter the number between 1 to 5!!");

			}

		} // end of while loop

	}

}
