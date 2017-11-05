/*
 * There are 3 numbers given as input sort them in increasing order.
 */
import java.util.Scanner;	//importing Scanner class
public class Sort {	//creating a public class
	public static void main(String args[]) {	//starting the main method
		int num1, num2, num3;	//declaring variables
		Scanner sc=new Scanner(System.in);	//creating scanner object
		
		// Taking input
		System.out.println("Please enter the first number: ");
		num1=sc.nextInt();
		System.out.println("Please enter the second number..");
		num2=sc.nextInt();
		System.out.println("Please enter the third number: ");
		num3=sc.nextInt();
		
		
//business logic
		
		int firstplace=0, secondplace=0, thirdplace=0; 
		
		//firstplace
		
		if(num1<num2 && num1<num3) {
			firstplace=num1;
		}
		else if(num2<num1 && num2<num3) {
			firstplace=num2;
		}
		else if(num3<num1 && num3<num2) {
			firstplace=num3;
		}
		
		//third place
		
		if(num1>num2 && num1>num3) {
			thirdplace=num1;
		}
		else if (num2>num3 && num2>num1)
		{
			thirdplace=num2;
		}
		else if(num3>num1 && num3>num2) {
			thirdplace=num3;
		}
		
		//second place
		if (num1!=firstplace && num1!=thirdplace) {
			secondplace=num1;
		}
		else if (num2!=firstplace && num2!=thirdplace) {
			secondplace=num2;
		}
		else if (num3!=firstplace && num3!=thirdplace) {
			secondplace=num3;
		}
		
		
	//output
		
		System.out.println("The given numbers "+num1+", "+num2+", "+num3+" in ascending order are as: ");
		System.out.println(firstplace+"\n"+secondplace+"\n"+thirdplace);
	
		
		sc.close();	//closing scanner object
	}
	
}
