package useOfLoop;

public class UseOfDoWhileLoop {

	public static void main(String[] args) {
		/*
		 For comparison with for loop 
		 for (int i = 1; i <= 10; i++) {
		 System.out.println(i); 
		 }
		 
		 * for comparison with while loop 
		 int i = 1; 
		 while (i <= 10) {
		 System.out.println("The values are: " + i); i++; 
		 }
		  
		 * first initialization block then do (// whether the condition is true or
		 * false, the first loop will started) the sysout, then increment or decrement,
		 * then condition inside while
		 */

		int a = 6; // condition doesn't meet, but execute once

		do {
			System.out.println(a);
			a = a + 2;
		} while (a <= 5);
		System.out.println("\n*************************************\n");

		int i = 1; // condition meet, execute will continue

		do {
			System.out.println(i);
			i = i + 2;
		} while (i <= 5);
		System.out.println("\n*************************************\n");

		int j = 1;
		do {
			System.out.println("The values are: " + j);
			j++;
		} while (j >= 5); // as the condition is not true, loop stop after 1st try.
		System.out.println("****************");
		int k = 10;
		// when the condition is true or false, the first loop will started
		do {
			System.out.println("The values are: " + k);
			k = k - 3;
		} while (k >= 5);
	}

}
