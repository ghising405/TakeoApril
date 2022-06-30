package fun_assignment;

import java.util.Scanner;

public class CalculateApp {

	// 5. creating methods - add, sub and multiplication
	int fno;
	int sno;
	int result;
	Scanner sc = new Scanner(System.in);

	void add() {
		// the user will enter the fno and sno, and then the method will calculate the
		// result based on their choice
		System.out.println("Enter the First number");
		fno = sc.nextInt();
		System.out.println("Enter the Second number");
		sno = sc.nextInt();
		result = fno + sno;
		System.out.println("Adding of two numbers: " + result);
	}

	void sub() {
		// the user will enter fno and sno, and we will do the calculation
		System.out.println("Enter the First number");
		fno = sc.nextInt();
		System.out.println("Enter the Second number");
		sno = sc.nextInt();
		result = fno - sno;
		System.out.println("Subtracting two numbers :" + result);
	}

	void mul() {
		// the user will enter the fno and sno and we will do calculation
		System.out.println("Enter the First number");
		fno = sc.nextInt();
		System.out.println("Enter the Second number");
		sno = sc.nextInt();
		result = fno * sno;
		System.out.println("Multiplicationn of two numbers : " + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 6. to call the non static method in main method, we need to create object and
		// call it
		CalculateApp calImpl = new CalculateApp();

		while (true) // 1
		{
			System.out.println("*******************************************");

			System.out.println("          1) ADD                           ");
			System.out.println("          2) SUB                         ");
			System.out.println("          3) MUL                           ");
			System.out.println("          4) EXIT                         ");

			System.out.println("*******************************************");

			// 2. let the user choose the option which one they want to choose. 1-add,
			// 2-sub, 3-mul, 4-exit
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			// 3. now you use the switch case because user might use any number from 1 to 4.
			// So have all the options inside here
			switch (choice) // we are going to switch choice
			{
			case 1:
				// 4. here we need to call the addition method from outside main method. So now
				// create method for all those options.
				// 7. call the method here. option1 = case 1 = add
				calImpl.add();
				break;
			case 2:
				// case 2 = option 2 = sub
				calImpl.sub();
				break;
			case 3:
				// case 3 = option 3 = mul
				calImpl.mul();
				break;
			// case 4 - we will exit the application
			case 4:
				System.out.println("Thank you for using the App!! :) ");
				System.exit(0); // this statement helps the system to exit

			default:
				System.out.println("Please enter the number between 1 to 4");
				// the switch will come to this case if the user entered number that is not
				// between 1 to 4. eg 6-then this part executes.
			}

		} // end of while loop

	}

}

//to make this run continuously we use while loop. when you run it runs for infinity.
//and now i want to control this one. (running infinitely)
