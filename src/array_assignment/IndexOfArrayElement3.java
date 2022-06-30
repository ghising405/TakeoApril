package array_assignment;

public class IndexOfArrayElement3 {

	static void findIndex(int arr[]) {

		int value = 30;

		// 2.finding index of an array element
		for (int i = 0; i < arr.length - 1; ++i) {
			if (arr[i] == value)
				System.out.println("The index is : " + i);
		}
		System.out.println("No index found"); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. declaring array
		int ar[] = { 10, 20, 30, 40, 50 };

		findIndex(ar);

	}

}

/*
 * Write a java program to find the index of an array element. i.e. {10, 20, 30,
 * 40, 50} index: 0 1 2 3 4 (we have to find this)
 */
