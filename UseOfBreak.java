package useOfLoop;

public class UseOfBreak {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 8; i++) {
			System.out.println("The values are: "+i);
		}
		System.out.println("****** After the break values are ******");
		for (int j = 1; j <= 8; j++) {
			if  (j == 5) {
			    break;//when we use break, then the loop is completed before that
				  }
				System.out.println("The values are: "+j);
			}


	}

}
