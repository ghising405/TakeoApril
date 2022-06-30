package operators;

public class LogicAndEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(a<b&&a++<c); 
		//10<5 = first condition is false so it will not check the second condition
		System.out.println(a); //10 
		//because the second condition did not execute so a will have the original value
		
		System.out.println(a>b&&a++<c); //true
		System.out.println(a); //11 because the second condition executed
		/*so : a=10
		 * 	   ++ = 10+1
		 * 		  = final value of a = 11
		 */
		
		
		System.out.println(a<b&a++<c); //even though the first condition is true or false, the second condition will be executed.
		System.out.println(a); //11+1=12
		/* 11<5 => false but it will still check the second condition
		 * second condition: a = 11
		 * 					++ = 11+1 = 12
		 * 	now it checks 	12<20 = true
		 * and the value of a will be 12				
		 * 
		 */
		
		System.out.println(a>b||a++<c); 
		System.out.println(a); //12
		/* this is logical or. If the first condition is true then it will not check for second condition
		 * 12>5 = true (the execution stops here. it will not check the second condition
		 * so a =  12
		 */
		
		System.out.println(a>b|a++<c); 
		System.out.println(a);
		/* this is bitwise or. First condition (true or false --> it will check second condition)
		 * 12>5 = true 
		 * now checks the second condition
		 * a = 12
		 * ++ = 12+1 =13
		 * 13<20 = true 
		 * a = 13 will be printed
		 * 
		 */
	
		
		
		
	}

}
