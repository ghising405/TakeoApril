package staticnonstaticround2;

public class Sdemo3 {
	
	int i;
	static int j;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sdemo3 s = null;
		//System.out.println(s.i); //s is trying to access non static variable and s have reference variable value null, so it will give null pointer exception
		
		System.out.println(s.j); //j is static so reference variable s can access j
		Sdemo3 s1 = new Sdemo3();
		System.out.println(s1);
		s1.i=25;
		s1.j=35;
		System.out.println(j);
		Sdemo3 s2 = new Sdemo3();
		Sdemo3 s3 = new Sdemo3();
		s2.i = 10;
		System.out.println(s3.i);
		System.out.println(s3.j);
	}

}
