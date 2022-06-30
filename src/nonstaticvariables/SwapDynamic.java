/*Here w are going to dynamically read the data and perform the swap.
 * first you need to declare the variable (best practice outside the method, that way you can reuse that variable )
 * second you need to create object of the scanner class. And then object reference variable of that scanner class
 * so that we can access the method inside the scanner class.
 * then you get the input from user
 * then you write the logic to swap the number
 * then you create object of that class to access that method in the main method.
 * then you can call the method outside main method using that object reference variable
 */

package nonstaticvariables;

import java.util.Scanner;

public class SwapDynamic {
	
	int fno; //variable declared
	int sno;
	
	Scanner sc = new Scanner(System.in); //object and reference variable created for scanner class
	
	void swap() { //here we are creating swap method
		
		//we are going not going to make the values fixed (static). We will make it dynamic.
		System.out.println("Enter first number"); //asking user to enter first number
		fno=sc.nextInt(); //using this the user can enter integer number
		
		System.out.println("Enter second number"); //asking user to enter second number
		sno=sc.nextInt(); //the user can enter another integer value
		
		System.out.println("Before swapping :");
		System.out.println("fno: " + fno + " sno : " + sno);
		
		int temp=0;
		//now we will write the logic to swap the number
		temp=fno;
		fno=sno;
		sno=temp;
		
		System.out.println("After swapping :");
		System.out.println("fno: " + fno + " sno : " + sno);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*now we want to access the swap method. And because it is nonstatic method, we cannot directly access it. 
		we need to create object of the class, to access that method because the class has the method.*/
		
		SwapDynamic sdynamic = new SwapDynamic(); //object and reference variable created to access the method in main method
		sdynamic.swap();
		System.out.println("after calling the method"+"fno: " + sdynamic.fno + " sno : " + sdynamic.sno);

	}

}
