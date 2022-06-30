package flowcontrols;

public class PatternEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 12345
		 * 678910
		 * ....... up to 100. we have 5 columns.
		 * calculate row => total/column = 100/5 = 20 rows
		 */
		int k=1;
		for(int i=0; i<20; i++) 
		{
			for(int j=0; j<5; j++) 
			{
				System.out.print(k+ " "); //from inner loop increase the value.
				k+=1;
			}
			System.out.println(); //from outer loop change the line.
		} 
	}

}
