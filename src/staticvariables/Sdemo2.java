package staticvariables;

public class Sdemo2 {
	
	int i;
	static int j;
	
	static void function1() {
		System.out.println("j value is = " +j); //0
		j=j+1; //1
		System.out.println("j value is = " +j); //1  2 3
		
		Sdemo2 s1 = new Sdemo2(); //this is a local object to this method. once the execution is finished, this object will be destroyed because we are not storing anywhere outside.
		s1.i = 30;
		System.out.println(s1.i); //30  30 
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		function1(); // 0 1 30
		function1(); // 0 2 30
		function1(); // 0 3 30
		
		Sdemo2 s1 = new Sdemo2();
		System.out.println(s1.i); //0 this is because a new object has been created and in non-static, the new object will have the original value, not the latest value 
		s1.i = 150;
		System.out.println(s1.i); //150
		System.out.println(s1.j); //3
	} 

}
