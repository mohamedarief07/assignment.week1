package assignment.week1;

public class PrimeNumber {

	public static void main(String[] args) {

		int input = 18;// Declare an int Input and assign a value 13
		boolean flag = false;// Declare a boolean variable flag as false

		// Iterate from 2 to half of the input
		for (int i = 2; i < input / 2; i++) {
			// Divide the input with each for loop variable and check the remainder
			if (input % i == 0) {

				flag = true;// Set the flag as true when there is no remainder
				break; // break the iterator

			}

		}
		if (flag == false) {
			System.out.println(input + " is a Prime Number");

		} else {
			System.out.println(input + " is not a Prime Number");
		}

	}

}