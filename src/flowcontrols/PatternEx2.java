package flowcontrols;

public class PatternEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//pattern exercise 2 print 1 (5 column; 3 rows)
		
		
		for (int i=0; i<3; i++) //0<5-true-goes to inner loop; checks condition; 1<5-true-goes to inner loop and so on
		{
			for (int j=0; j<5; j++) //0<3-true; 1<3-true; 2<3-true; 3<3-false(goes outside inner loop)
			{
				System.out.print("1 ");// 1 1 1
			}
			
			System.out.println(); //then cursor goes to next line
		}
	}

}
