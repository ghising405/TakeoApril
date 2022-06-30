package flowcontrols;

public class PatternEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 246810 1214161820 ....... up to 100. column=5; row = total/column = 100/5=20
		 * we are printing only even number so 20/2 = 10 rows
		 */
		int k = 2;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(k + " ");
				k += 2;

			}
			System.out.println();
		}

	}

}
