package operators;

public class TernaryEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		int b = 5;
		
		int min=(a<b)?a:b;
		System.out.println(min); //2<5 = true ; so a ko value will print i.e. 2
		
		int max=(a>b)?a:b;
		System.out.println(max); //2>5 = false ; so b ko value will print i.e. 5
		
		String num=(10%2==0)?"Even":"Odd";
		System.out.println(num); //0=0 ; true ; even will print
		

	}

}
