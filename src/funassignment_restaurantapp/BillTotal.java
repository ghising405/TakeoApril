package funassignment_restaurantapp;

public class BillTotal {

	static int total_bill;

	public void billDetails() {

		// declared the variable as static in the other class and called it here.

		IceCreamTypes.icecreamtotalBill();
		BiryaniTypes.biryani_totalBill();
		DrinksTypes.drinks_totalBill();

		total_bill = IceCreamTypes.icecream_totalBill + BiryaniTypes.biryani_total + DrinksTypes.drink_total;
		System.out.println("The Total is : " + total_bill + "$");

	}

}
