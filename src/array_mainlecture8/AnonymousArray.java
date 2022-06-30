package array_mainlecture8;

public class AnonymousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// there is one more way we can define array.
		int ar[] = { 100, 200, 300, 400 }; // This is called anonymous array
		//declaration time itself we are assigning the values.
		// how to access/ display / iterate / repeat this array? using for each.

		for (int j : ar) {
			System.out.println(j);
		}

	}

}

/*
 * We can create an array without a name. Such types of nameless arrays are
 * called anonymous arrays. The main purpose of an anonymous array is just for
 * instant use (just for one-time usage). An anonymous array is passed as an
 * argument of a method. Note: For Anonymous array creation, do not mention size
 * in []. The number of values passing inside {} will become the size.
 */