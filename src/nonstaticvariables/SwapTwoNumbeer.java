package nonstaticvariables;

public class SwapTwoNumbeer {
	
	
	/*This is going to be about non static variable
	 * To access non-static variable or method, you need to create an object and a reference variable of that object.
	 * Its a good practice to declare the variable outside the method because if we declare it inside the method then
	 * the variable becomes local variable and only that particular method will be able to access those variables.
	 * so it is a good practice to declare the variable outside the method and access inside it.
	 * When variables are declared outside the method, then you can reuse those variables
	 */
	
	//declaring variable outside the method
	int fno;
	int sno;
	int temp=0;
	
	//here we are creating non-static method or instance method
	void swap() {
		
		fno=100;
		sno=200;
		
		System.out.println("Before swapping :");
		System.out.println("fno: " + fno + " sno : " + sno);
		
		temp=fno;
		fno=sno;
		sno=temp;
		
		System.out.println("After swapping :");
		System.out.println("fno : " + fno + " sno : " + sno);
		
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here we are trying to access the Swap method. For that we need to create object and the object reference variable.
		
		SwapTwoNumbeer sw = new SwapTwoNumbeer();
		System.out.println("Before calling the swap method : " + "fno :"+"\t"+sw.fno+"\t"+"sno :"+sw.sno);
		
		sw.swap();
		System.out.println("After calling the swap method : " + "fno :"+"\t"+sw.fno+"\t"+"sno :"+sw.sno);

	}

}
