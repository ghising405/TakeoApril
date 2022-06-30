package operators;

public class Test {
	
	int x,y=900; 
	/*here we can declare the variable like this because JVM will assign default value to non-static variables.
	 * so x = 0
	 * 	  y = 900
	 * if we want to modify the existing the value, then we can do that from main method only. not here
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a,b,c=30; 
		//System.out.println(a+ " "+b+" "+c); 
		/*we cannot do like this because JVM will not assign default value to local variable
		 * and that's why a and b is getting error. only c=30 will be there.
		*/
		
		//instead we can do like this
		int a=20,b=15,c=30;
		
		//accessing the non-static variable
		System.out.println(a+ " "+b+" "+c); 
		System.out.println(new Test().x); //0 created object and directly accessing the non static variable
		
		//we can modify the variable value in main method only
		System.out.println(new Test().x=900); //before 0; now 900
		System.out.println(new Test().y); //900
		

	}

}
