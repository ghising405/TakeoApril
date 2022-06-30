package array_mainlecture8;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring array
		int ar[] = new int[3];

		// how to access the value in that array
		System.out.println(ar[0]); // 0 - default value of integer = 0
		System.out.println(ar[1]); // 0 - default value of integer = 0
		System.out.println(ar[2]); // 0 - default value of integer = 0

		// if you try to access array out of the index range then you get error. So,
		// don't access out of the range
		// System.out.println(ar[3]); //ArrayIndexOutOfBoundException
		
		
		//how to modify the values?
		ar[0]=100;
		ar[2]=200;
		System.out.println(ar[0]); //100 - whatever is the latest value
		System.out.println(ar[1]); //0   - whatever is the latest value
		System.out.println(ar[2]); //200 - whatever is the latest value

	}

}
