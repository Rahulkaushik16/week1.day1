package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n = 8, s1 = 0, s2 = 1, s3; // initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in
										// the series)

		System.out.print(s1 + " "); // Print first number

		for (int i = 1; i < n; i++) { // Iterate from 1 to the range

			s3 = s1 + s2; // add first and second number assign to sum

			s1 = s2; // Assign second number to the first number

			s2 = s3; // Assign sum to the second number

			System.out.print(s1 + " "); // print sum

		}

	}
}
