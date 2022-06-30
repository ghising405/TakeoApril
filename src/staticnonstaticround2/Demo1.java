package staticnonstaticround2;

public class Demo1 {
	
	int x = 0;
	Demo1 sila = null;
	void functionD()
	{
		sila = new Demo1();
		sila.x = 10;
		System.out.println(x);
		System.out.println(sila.x);
		
	}
	
	void functionN() {
		
		sila = new Demo1();
		sila.x = 10;
		System.out.println(x);
		System.out.println(sila.x);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 sila = new Demo1();
		sila.x = 400;
		sila.functionD();
		sila.functionN();
		System.out.println(sila.sila.x);
		System.out.println(sila.x);
	}

}
