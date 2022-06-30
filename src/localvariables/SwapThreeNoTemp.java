package localvariables;

public class SwapThreeNoTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fno = 100;
		int sno = 200;
		int tno = 300;
		
		System.out.println("Before swapping :");
		System.out.println("first number is : " + fno + " second number is : " + sno + " third number is :" + tno);
		
		
		//swapping
		fno = fno + sno + tno; //100+200+300  = 600 (now the value is 600)
		sno = fno - sno - tno; //600-200-300 = 100 (now the value is 100)
		tno = fno - sno - tno; //600-100-300 = 200 (now the value is 200)
		fno = fno - sno - tno; //600-100-200 = 300 (now the value is 300)
		
		System.out.println("After swapping :");
		System.out.println("first number is : " + fno + " second number is : " + sno + " third number is :" + tno);
		
		

	}

}
