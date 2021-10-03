package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {

		int rem, num = 13; // Declare an int Input and assign a value 13

		boolean flag = false; // Declare a boolean variable flag as false

		for (int i = 2; i <= num / 2; i++) { // Iterate from 2 to half of the input

			rem = num % i; // Divide the input with each for loop variable and check the remainder

			if (rem == 0) {
				flag = true; // Set the flag as true when there is no remainder
				break; // break the iterator
			}
		}

		if (flag!=true) // Check the flag (Provide a condition)
			System.out.println(num + " is a Prime Number"); // Print 'Prime' when the condition matches
		else
			System.out.println(num + " is not a Prime Number"); // Print 'Not a Prime' when the condition doesn't match

	}

}