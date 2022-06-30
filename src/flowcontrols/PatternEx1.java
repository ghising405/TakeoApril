package flowcontrols;

public class PatternEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * here we are trying to print 5 stars (5 rows and 5 columns)
		 */
		
		for(int i=0; i<5; ++i) //0<5=true; goes to inner loop; checks the outer  loop 1<5-true - goes to inner loop and so on
		{
			for (int j=0; j<5; j++) { //0<5-true; 1<5-true; 2<5-true; 3<5-true; 4<5-true; 5<5-false (comes out of inner loop) 
				System.out.print("* "); //* * * * * 
			}
			System.out.println(); //this is the statement for outer loop. this is changing the line. it is going to next line
		}

	}

}
