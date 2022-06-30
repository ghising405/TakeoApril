package array_mainlecture8;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//normally declaring array
		int ar[] = new int[3];
		ar[0]=100;
		ar[1]=200;
		ar[2]=300;
		//accessing the array
		System.out.println(ar[0]);
		System.out.println(ar[1]); 
		System.out.println(ar[2]);
		
		
		System.out.println("-----------------------------------------------"); 
		
		//how to use for loop and display? (instead of accessing individually)
		//length is a non-static property.
		for (int i=0; i<ar.length; ++i)  //i points to the index
		{
			System.out.println(ar[i]); 
		} //therefore, using for loop we can iterate/ repeat the remaining.
		
		System.out.println("-----------------------------------------------"); 
		
		//we can also use for each to iterate / repeat.
		for(int j:ar)  //j points directly to the index value.
		{
			System.out.println(j); 
		}
		
		//Therefore, this is the way we can use for loop.

	}

}
