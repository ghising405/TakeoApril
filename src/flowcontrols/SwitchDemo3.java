package flowcontrols;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b=50;
		final byte c=20; //c is a constant variable now
		
		switch(b+20) //
		{
		case c+30:
			System.out.println("case label=argument; c+30=20+30=50 = 50");
			break;
		case 30:
			System.out.println("30 execute");
			break;
		default:
			System.out.println("none of the cases are matchinng so default");
		}
		
	}

}


//here I am going to add in argument. i.e. switch(b+20) --> default value printed
