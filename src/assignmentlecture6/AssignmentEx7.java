package assignmentlecture6;

public class AssignmentEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(k + " "); // prints the value of k = 1 2 3 4 5 6 7....
				k += 1;
			}
			System.out.println(); // takes the cursor to next line
		}

	}

}

/*
 * 12345678910 ------- up to 100 column = 10 row = total/column = 100/10 = 10
 */
