package localvariables;

public class SwapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*here i have to swap two numbers a ko b maa, b ko c maa halane. To do that, 
		 * first you have to create one empty variable. And then tesmaa you put that number. 
		 * its like putting water from one jar to another jar. There are two jar with water. 
		 * And now to swap you need another jar (and that extra jar is temp variable)
		a*/

		int fno = 100; //first number
		int sno = 200; //second number
		
		int temp =  0;
		System.out.println("Before swapping :");
		System.out.println("first number is : " + fno + " second number is : " + sno);
		
		//now we are going to swap
		temp = fno;
		fno  = sno;
		sno = temp;
		
		System.out.println("After swapping :");
		System.out.println("first number is : " + fno + " second number is : " + sno);
		
	
	}

}
