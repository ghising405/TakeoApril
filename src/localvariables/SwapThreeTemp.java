package localvariables;

public class SwapThreeTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fno =  100;
		int sno = 200;
		int tno =  300;
		
		int temp = 0;
		
		System.out.println("Before swapping :");
		System.out.println("first number is : " + fno + " second number is : " + sno + " third number is :" + tno);
		
		//we are going to swap
		temp = fno;
		fno = sno;
		sno =  tno;
		tno =  temp;
		
		System.out.println("Before swapping :");
		System.out.println("first number is : " + fno + " second number is : " + sno + " third number is :" + tno);
		

	}

}
