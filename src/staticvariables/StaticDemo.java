/* method and variable is static when we use the keyword "static" in front of it.
 * int i; this is non static
 * void funA() {
		System.out.println("This is non-static method because it does not have static keyword");
	}
 Here we have two rules:
 we can access the static method and static variable 
 i. directly 		ii. using classname
 */

package staticvariables;

public class StaticDemo {
	
	//static variable declaration and initialization
	static int i=100; //this is static variable and we are declaring it. 
	
	
	static void funA() {
		System.out.println("This is static method because it has static keyword and we can call directly without creating object");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Calling the variable directly :" + i); //calling the static variable directly
		
		//1.Because the method and variable is static, we don't need to create object. So here, we can call the method directly since the method is static.
		funA();  //calling the function directly.
		
		//2.we can also access the static variable and static method using classname.
		System.out.println("Accessing static variable with classname: " + StaticDemo.i);
		StaticDemo.funA();
	
		//3.we can also access the static method and static variable using object reference variable.
		StaticDemo stat = new StaticDemo();
		System.out.println("accessing with reference variable : "+ stat.i);
		stat.funA(); 
		
		
		//4.even though the reference variable value is null, we can access the static method and variables.
		StaticDemo demo1=null;  
		System.out.println("even if reference variable is null we can access static variable: "+ stat.i);
		demo1.funA();

	}

}
