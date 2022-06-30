package funassignment_restaurantapp;

import java.util.Scanner;

public class IceCreamTypes {

	Scanner sc = new Scanner(System.in);
	int price;
	int qty;
	int butter_total;
	int vanilla_total;
	static int icecream_totalBill;

	void butterscotch() {

		System.out.println("Home made butterscoth for all this summer.");
		price = 20;
		System.out.print("How many butterscotch would you like?");
		qty = sc.nextInt();
		butter_total = price * qty;
		icecream_totalBill=butter_total;  //icecream_totalBill=butter_total
		System.out.println("The total for butterscotch is " + butter_total + "$");
	}

	void vanilla() {
		System.out.println("Home made Vanilla for all this summer.");
		price = 10;
		System.out.print("How many Vanilla would you like?");
		qty = sc.nextInt();
		vanilla_total = price * qty;
		icecream_totalBill+=vanilla_total; //icecream_totalBill=butter_total+vanilla_total
		System.out.println("The total for Vanilla is " + vanilla_total + "$");
	}

	static void icecreamtotalBill() {
		//icecream_totalBill = butter_total + vanilla_total;
		if (icecream_totalBill != 0)
			System.out.println("The total bill for  Icre-Cream is : " + icecream_totalBill + "$");
	}

	public void icecreamDetails() {
		System.out.println("*************************************************");
		System.out.println("              1.Butterscotch - 20$               ");
		System.out.println("              2.Vanilla      - 10$                ");
		System.out.println("              3.Back                             ");
		System.out.println("*************************************************");

		// 1.we want user to enter the number
		System.out.println("Enter ice-cream of your choice");
		int choice = sc.nextInt();

		switch (choice) {
		// create method of them and call here
		case 1:
			// call method for butterscotch
			butterscotch();
			icecreamDetails(); // we want to display these list
			break;

		case 2:
			// call method for vanilla
			vanilla();
			icecreamDetails();
			break;

		case 3:
			// we are going back. (main page/ main method)
			RestaurantApp.main(null); // classname.main()

		default:
			System.out.println("Please enter the number between 1 and 2");
			icecreamDetails();

		}

	}

}
