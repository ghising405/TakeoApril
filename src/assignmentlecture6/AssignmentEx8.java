package assignmentlecture6;

public class AssignmentEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 1;
		for (int i=0; i<5; i++) 
		{
			for (int j=0; j<5; j++) 
			{
				System.out.print(k + " "); //k= 1 3 5 7 9.. 
				k+=2;
			}
			System.out.println(); //takes the cursor to next line
		}

	}

}



/*13579
 * up to 50 odd
 * column=5
 * row = total/column = 50/5 = 10/2= 5
 */
