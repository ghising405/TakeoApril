package array_assignment;

public class MaxAndMinValue5 {

	static void maxValue(int arr[]) {
		
		int max = arr[0]; //10 , now 20,
		//now we have to compare the values repeatedly with other index values
		for(int i=1; i<arr.length-1; ++i) 
		{
			if(arr[i] > max) //if this is true 20>10
			{
				max = arr[i]; //then max value will be the new higher value i.e. 20
			}
		}
		System.out.println("The maximum index value is : " + max);
	}
	
	
	
	static void minValue(int ar[]) 
	{
		int min = ar[0]; //10, 0
		
		//now we have to compare the values repeatedly with other index values
		for (int i=1; i<ar.length-1; ++i) 
		{
			if(ar[i] < min) //i=1-2500<10-false; i=2-0<10-true; i=3-500<0-false; loop ends
			{
				min = ar[i]; //0; 
			}
		}	
		System.out.println("The minimum index value is : " + min);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. declaring array
		int ar[] = {10, 2500, 0, 500};
		
		maxValue(ar);
		
		minValue(ar);

	}

}
