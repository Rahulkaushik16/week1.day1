package week1.day1.assignments;

public class Factorial {

	public static void main(String[] args) {

		int num = 5; // Declare your input as 5

		int fact = 1; // Declare an integer variable fact as 1

		for (int i = 1; i <= num; i++) {  // Iterate from 1 to your input (tip: using loop concept)

			fact = fact * i;  // Within the loop: Multiply fact with the iterator variable (Tip: Assign it to
								// the 'fact' variable)

		}  // End of loop

		System.out.println("Factorial of " + num + " is: " + fact);  // Print factorial (fact)

	}

}
