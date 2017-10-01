import java.util.Scanner; //importing scanner class

public class Factorial { // declaring a public class Factorial
	public static void main(String[] vb) { // starting the main method
		int n, res = 1, i, fact=1; // initializing variables
		// input, processing and output
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number from 1 to 100: ");
		n = sc.nextInt();
		if (n <= 100) {
			for (i = 1; i <= n; i++) {
				fact = res * i;
			}
			System.out.println("The factorial of " + n + " is: " + fact);

		} else {
			System.out.println("Please enter a valid number.\nValid numbers are between 0 and 100");
		}
		sc.close();
	}

}
