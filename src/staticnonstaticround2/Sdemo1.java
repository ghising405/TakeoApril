package staticnonstaticround2;

public class Sdemo1 {
	
	int i;
	static int j;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sdemo1 s = new  Sdemo1();
		System.out.println(s.i); //0
		System.out.println(j); //0
		j=25;
		System.out.println(j); //25
		Sdemo1 s1 = new Sdemo1();
		s1.i=20;
		System.out.println(s1.i); //20
		System.out.println(s1.j); //25
	}

}
