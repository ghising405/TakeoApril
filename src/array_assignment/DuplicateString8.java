package array_assignment;

public class DuplicateString8 {
	
	static void duplicateString(String ar[]) 
	{
		System.out.print("The duplicate string is : ");
		for(int i=0; i<ar.length; ++i) 
		{
			for(int j=i+1; j<ar.length; ++j) 
			{
				if(ar[i] == ar[j]) 
				{
					System.out.print(ar[j] + "  ");
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ar[] = {"apple", "orange", "mango", "apple", "orange", "mango"};
		duplicateString(ar);
		
		
		

	}

}
