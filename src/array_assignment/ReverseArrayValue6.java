package array_assignment;


public class ReverseArrayValue6 {

	
	static void reverseArray(int arr[]) 
	{
	  //printing original array
		System.out.println("Original array : ");
		for(int i=0; i<arr.length; ++i) 
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		//printing array starting from last element
		System.out.println("Reversed array : ");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.declaring array
		int ar[] = { 5, 6, 7, 8};
		
		//ArrayUtils.reverse(int ar[]);
		
		reverseArray(ar);

	}

}

/*
 * Input : 1, 2, 3, 4, 5 ______ Output :5, 4, 3, 2, 1
 */