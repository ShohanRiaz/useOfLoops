package useOfLoop;

public class UseOfForLoop {

	public static void main(String[] args) {
		/* Loop contain: initialization block (initialization); Conditional block
		 * (condition); Incremental or decremental block everyone forgot to put ;*/
		// 1st way
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("\n****************************\n");
		// 2nd way
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("\n*****************************\n");
		// 3rd way
		for (int i = 1; i < 10; i = i + 3) {
			System.out.println("The values are: " + i);
		}
		System.out.println("\n*****************************\n");
		// 4th way
		int j = 3;
		for (int i = 1; i < 10; i = i + 3) {
			System.out.println("The values are: " + i * j);
		}
		System.out.println("\n******************************\n");
		// 5th way
		for (int i = 15; i >= 10; i--) {
			System.out.println(i);
		}
		System.out.println("\n******************************\n");
		// 6th way
		int k = 4;
		for (int i = 15; i >= 10; i = i - 2) {
			System.out.println("The values are: " + i * k);
		}
	}
}
