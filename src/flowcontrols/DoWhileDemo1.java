package flowcontrols;

public class DoWhileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		do
		{
			System.out.println(i);
			++i;
		} while(i<5);  //when condition is true o/p -- 0 1 2 3 4
		
		
		System.out.println("***************");
		
		int j=0;
		do 
		{
			System.out.println(j);
			++i;
		} while(j>5); //when condition is false
		
		

	}

}
