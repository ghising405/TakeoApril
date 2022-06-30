package operators;

public class OperatorIncreExp {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = ++x; //first - increase the value of x and then assign to y - pre-increment
		System.out.println(x); //11 - 10+1=11 increased the value
		System.out.println(y); //11 - assigned the value to y
		
		
		int a = 10;
		int b = a++; //first assign the value to y and then increase the value of x
		System.out.println(a); //10 a ko value assigned to b
		System.out.println(b); //11  then increased the value of a
		System.out.println(a--); //11 at first a ko value will be assigned so a ko value will be printed.
		System.out.println(a);
		System.out.println(--a); //10

	}

}
