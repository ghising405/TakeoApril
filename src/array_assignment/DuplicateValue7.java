package array_assignment;

public class DuplicateValue7 {

	static void duplicateValue(int arr[]) {
		System.out.print("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int i = 0; i < arr.length; ++i) {
			for (int j = i+1; j < arr.length; j++)
				if (arr[i] == arr[j])
					System.out.print(arr[j]+ " ");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = { 20, 10, 20, 5, 10, 5};

		duplicateValue(ar);

	}

}
