package operators;

public class AssignmentExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;  //this is local variable
		a+=3; //a=a+3 = 10+3 = 13
		System.out.println(a);
		
		a-=4; //a=a-4 = 13-4 = 9
		System.out.println(a);
		
		a*=4; //a=a*4 = 9*4 = 36
		System.out.println(a);
		
		a/=2; //a=a/2 = 36/2 = 18
		System.out.println(a);
		
		a%=2; //a=a%2  = 18%2  = 0
		System.out.println(a);
		
	}
}

/*here, static keyword is used and that means 1 memory will be allocated.
 * in that memory the static method and static variables will be there
 * and the latest value will be the current value
 * also here, a is a local variable (variable inside the method) so java will 
 * read line by line , so latest value will be the current value.
 */
