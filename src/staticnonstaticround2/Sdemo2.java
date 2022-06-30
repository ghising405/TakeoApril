package staticnonstaticround2;

public class Sdemo2 {
	
	int i;
	static int j;
	
	static void function1() {
		
		System.out.println("j value is = " + j);
		j=j+1;
		System.out.println("j value is = " + j);
		Sdemo2 s1 = new Sdemo2();
		s1.i = 30;
		System.out.println(s1.i);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		function1();
		function1();
		function1();
		
		Sdemo2 s1 = new Sdemo2();
		System.out.println(s1.i);
		s1.i = 150;
		System.out.println(s1.i);
		System.out.println(s1.j);
		
	}

}
