package array_assignment;

public class AverageValue1 {

	// here we will write logic to calculate average
	static void average(int arr[]) {
		int sum = arr[0];
		int counter = 0;

		// calculating sum
		for (int i = 0; i < arr.length - 1; ++i) {
			sum += arr[i + 1]; // sum=10+20+30+40=100
		}
		System.out.println("The sum is : " + sum);

		
		// counting the number of indices
		counter = arr.length;
		System.out.println("Total number of indices is : " + counter);

		
		//calculating the average
		int average = sum / counter;
		System.out.println("The average of the array is : " + average);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.declaring an array
		int ar[] = { 100, 200, 300, 400 };

		// creating a method to find average and calling the method
		average(ar);

	}

}

/*
 * Write a java program to calculate the average value of array.
 */
