package array_assignment;

public class CommonElmntBtnTwoArray9 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ar[] = { "This", "is", "amazing", "grace"};
		String str[] = { "amazing", "grace", "grateful" };

		
		System.out.print("Common element between two arrays : ");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if (ar[i].equals(str[j])) {
					System.out.print(ar[i] + " ");
				}	
			}
		}

	}

}

/*
 * Input: Array1 = ["Article", "for", "Geeks", "for", "Geeks"], 
 * Array2 = ["Article", "Geeks", "Geeks"] -------- Output: [Article,Geeks]
 */
