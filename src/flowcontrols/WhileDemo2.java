package flowcontrols;

public class WhileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		boolean flag = true;
		while (flag) {
			if (i == 10) {
				System.out.println(i);
				flag = false;
			}

			i++;
		}
	}

}
