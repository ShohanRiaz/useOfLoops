package useOfLoop;

public class UseOfNestedForLoop {
//more than one loop inside a loop
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 10; j <= 13; j++) {
				System.out.println(j*i);
			}
			
		}

	}

}
