package flowcontrols;

public class PatternEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*11111 5 row; 5 column
		 *22222   alternate way/ best way
		 *33333
		 *44444
		 *55555
		 */
		
		int k=1;
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
			k+=1;
		}
	}

}
