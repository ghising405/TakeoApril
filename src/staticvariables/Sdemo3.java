package staticvariables;

public class Sdemo3 {
	
	int i; //declaring non-static variable
	static int j; //declaring static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sdemo3 s = null; //here we have made non-static variable as null
		
		//System.out.println(s.i); //this will give us null pointer exception
		//Cannot read field "i" because "s" is null - so we will comment line 13.
		
		System.out.println(s.j); //0 - default value
		
		Sdemo3 s1 = new Sdemo3();
		System.out.println(s1); //printing the address of object reference variable s1
		s1.i = 25;
		s1.j = 35;
		
		System.out.println(j); //35
		
		Sdemo3 s2 = new Sdemo3();
		Sdemo3 s3 = new Sdemo3();
		s2.i = 10;
		
		System.out.println(s3.i); //0 - because s3 is new object and the original value will be assigned to x
		System.out.println(s3.j); //35 - j is static so whatever is the latest value, the new object will also get the same.
		
	}

}
