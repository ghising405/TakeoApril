package flowcontrols;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b=60;
		final byte c=20; //constant variable. c ko value is fixed.
		
		switch(b) 
		{
		case c+40:  //this will be like case 50. because c+30=20+30=50, so this statement executes
			System.out.println("c+40 is 20+40=60. case label= argument");
			break;
		case 20:
			System.out.println("20 execute");
			break;
			
		default:
			System.out.println("if none of the case label match with the argument then print default");
		}

	}

}

/* if you want to make a variable constant then use final keyword.
 * 
 */
