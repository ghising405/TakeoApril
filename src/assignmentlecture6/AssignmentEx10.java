package assignmentlecture6;

public class AssignmentEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=1;
		for(int i=0; i<5; i++) 
		{
			for (int j=0; j<5; j++) 
			{
				System.out.print(k+" ");
				k+=3;
			}
			System.out.println();
		}
	}

}


/* 1 4 7 10 13 -- up to 50 
 * column = 5
 * row = 50/5 = 10/2 = 5
 *
 */
