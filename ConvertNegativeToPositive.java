package week1.day1.assignments;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		int num = -40; //Initialize an integer with a negative number
		int positivenum;
		if (num < 0) { //Check if the number is a negative number 

			positivenum = ~(num - 1); //convert the number to a positive number

			System.out.println("The Number " +num + " is converted to " +positivenum); //Print the converted number
		}

		else {

			System.out.println("The Number " +num + " is not a negative Number"); 
		}

	}

}
