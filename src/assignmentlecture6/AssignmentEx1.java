package assignmentlecture6;

public class AssignmentEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 5 stars -- 5 row 5 column
		 */

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("* "); // this will print ***** in same line
			}
			System.out.println(); // this will take cursor to next line
		}
	}

}

/*
 * j- 0<5-true 1<5-true 2<5-true 3<5-true 4<5-true 5<5-false- goes to outer loop
 * and checks the condition and if true, goes to inner loop print * * * * *
 * 
 */
