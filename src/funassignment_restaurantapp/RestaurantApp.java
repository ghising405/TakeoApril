package funassignment_restaurantapp;

import java.util.Scanner;

public class RestaurantApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("*************************************");
			System.out.println("              1.Biryani             ");
			System.out.println("              2.Drinks               ");
			System.out.println("              3.Ice-Cream            ");
			System.out.println("              4.Bill                 ");
			System.out.println("              5.Exit                 ");
			System.out.println("**************************************");

			// 1. we want the user to choose any of these. So we need scanner class
			System.out.println("Enter your choice");
			int choice = sc.nextInt(); // user enters the number of their choice

			// 2. now we need switch case to show the functionality related to each of those
			// choices
			switch (choice) {
			case 1: // here we need details about Biryani. so we need to create another method or a
					// separate class
				// to call all the details about biryani, we will create object
				BiryaniTypes detail = new BiryaniTypes();
				detail.biryanidetails();
				break;

			case 2:
				// call drinks method
				DrinksTypes drinkdetail = new DrinksTypes();
				drinkdetail.drinkDetails();
				break;

			case 3:
				// call ice-cream method
				IceCreamTypes icedetail = new IceCreamTypes();
				icedetail.icecreamDetails();
				break;

			case 4:
				// call method for bill
				BillTotal billdet = new BillTotal();
				billdet.billDetails();

			case 5:
				System.out.println("Thank you for visiting. See you again!!");
				System.exit(0);

			default:
				System.out.println("Please choose from 1 to 5.");
			}
		}
	}

}
