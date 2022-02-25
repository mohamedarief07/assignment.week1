package assignment.week1;

public class SumOfDigits {
	/*
	 * Goal: Find the sum of digits of a given number
	 * 
	 * input: 123 output: 1+2+3 = 6
	 */
	public static void main(String[] args) {

		int num = 123;// Declare your input number (int)

		int sum = 0;// Initialize an integer variable by name: sum

		while (num > 0) {// Use loop to calculate the sum: use while loop to set condition until the
							// number goes greater than 0
			// Within loop: get the remainder when done by 10 -> Tip: use mod %
			sum = sum + (num % 10);
			num = num / 10;

		}
		System.out.println("Sum Of Digits is:" + sum);
	}

}
