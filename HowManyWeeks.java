import java.util.Scanner; //importing scanner class 

public class HowManyWeeks { // creating the class
	public static void main(String[] args) { // starting the main method
		// initializing variables
		int n, res;
		// Input
		System.out.println("Please enter the weekly water usage (in gallons): ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		// Business logic (Processing)
		res = 10000 / n;
		// Output
		System.out.println("The water will be sufficient for " + res + " weeks");
		sc.close(); // closing scanner object
	}

}
