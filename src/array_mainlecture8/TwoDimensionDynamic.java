package array_mainlecture8;

import java.util.Scanner;

public class TwoDimensionDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// How to enter values / data dynamically in 2D array?

		// 1. Declaring the array
		int ar[][] = new int[3][3]; // 3 row 3 column

		// 2.to enter data dynamically we need scanner class 
		//then we will use for loop to iterate/repeat (entering of) the index value
		
		Scanner sc = new Scanner(System.in);
		
		//iterating/repeating the loop - to enter the value
		for(int i=0; i<ar.length; ++i)   //from this loop we are just entering the values in 2D array's index
		{
			for(int j=0; j<ar.length; ++j) {
			System.out.println("Enter the number");
			ar[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		
		//display the value - using for loop
		for(int i=0; i<ar.length; ++i) {
			for(int j=0; j<ar.length; ++j) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------------");
		
		//now I want to sum each  and every row and display
		for(int i=0; i<ar.length; ++i) 
		{
			int sum=0;  //declaring the variable
			for(int j=0; j<ar.length; ++j) 
			{
				System.out.print(ar[i][j] + " ");
				sum+=ar[i][j];	//sum=1+2+3=6 again in next line sum=4+5+6=15.. and so on. existing value maa add garne
			}
			System.out.println(" = " + sum);
			
			System.out.println();
		}
		
		
	}

}
