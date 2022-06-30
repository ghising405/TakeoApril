package staticnonstaticround2;

public class Sdemo4 {
	
	int i;
	static int j;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sdemo4 s = null;
		//s.i = 25;
		//System.out.println(s.i);
		
		s.j=35;
		System.out.println(s.j);
		System.out.println(j);
		Sdemo4 s1 = new Sdemo4();
		s1.i = 10;
		Sdemo4 s2 = new Sdemo4();
		System.out.println(s2.i);
		s2.j = 203;
		System.out.println("s2 = " + s2.j);
		System.out.println("s2 = " + s1.j);
	}

}
