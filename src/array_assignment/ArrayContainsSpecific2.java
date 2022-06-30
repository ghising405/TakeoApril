package array_assignment;

public class ArrayContainsSpecific2 {

	static void arrayContains(int arr[]) {
		int searched_value = 80;

		// display the value in array
		for (int j : arr) // brings all the index values
		{
			if (j == searched_value)
				System.out.println("The array contains the searched value : " + j); // if searched value is in the list
		}
		
		System.out.println("The array does not contain the searched value."); // if searched value is not in the list then execute this.
		// but this line is not working. It prints any way.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.declaring the array
		int ar[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		arrayContains(ar);

	}

}

/*
 * Write a java program to test if an array contains a specific value.
 */
