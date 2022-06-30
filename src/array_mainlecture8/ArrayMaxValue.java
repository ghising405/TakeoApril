package array_mainlecture8;

public class ArrayMaxValue {
	
	static void maxValue(int arr[]) {  //parameterized this method with array. Made static so that it could be called directly.
		
		//1st we need a max value, and with that max value, we will compare other values
		int max = arr[0]; // ar[0]=10
		
		//using for loop to iterate/repeat the process of checking all the values with max vallue
		for(int i=0; i<arr.length-1; ++i) 
		{
			//now create a condition where we can check if the other value is greater that max or not
			if(arr[i+1] > max)  //if arr value is greater than max then the greater value will be new max value
			//arr[0+1]>arr[0] - 20>10-true ---- goes inside the condition--max=arr[i+1]=arr[0+1]=20
			{
				max=arr[i+1]; //if arr[i+1]>max, then max value will be increased
			}		
		}
		//after the loop completes the execution i.e. finish checking all the values with max value, it will come out of for loop
		System.out.println("Max value is : " + max);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find the maximum value in the array
		
		//1.declaring a variable - here anonymous  variable
		int ar[] = {10, 20, 30,90};
		
		//2.printing the value in array
		for(int j:ar) {
		System.out.print(j + " ");
		}
		System.out.println();
		
		//3.finding maximum number in array. For that create a different method and call it.
		//4. calling the maxValue method in main method
		maxValue(ar);
	}

}

/* https://www.programcreek.com/2013/09/top-10-methods-for-java-arrays/
 * Note - there is no predefined method in array.
 */
