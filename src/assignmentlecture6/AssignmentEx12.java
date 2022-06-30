package assignmentlecture6;

public class AssignmentEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c = 'A';
		for (int i=0; i<5; i++) 
		{
			for (int j=0; j<6; j++)
			{
				System.out.print(c + " ");
				c+=1;
			}
			System.out.println();
		}
	}

}



/* ABCDEF ---- up to end
 * column - 6
 * row = 26/6 = 5
 */
