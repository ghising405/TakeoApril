package localvariables;

public class SwapDemoWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fno = 100;
		int sno = 200;
		
		System.out.println("Before swapping :");
		System.out.println("first number is : " + fno + " second number is : " + sno);
		
		
		//after swapping
		fno = fno + sno; //100+200 = 300
		sno =  fno - sno; //300-200  = 100 (sno was 200 before, now it will be 100)
		fno = fno - sno; //300-100 = 200 (fno was 100 before, now it will be 200)
		
		System.out.println("After swapping :");
		System.out.println("first number is : " + fno + " second number is : " + sno);
		

	}

}
