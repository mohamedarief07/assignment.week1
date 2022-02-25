package assignment.week1;

public class FibonacciSeries {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 */
	public static void main(String[] args) {

		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		int range = 8;
		int n1 = 0;
		int n2 = 1;

		// Print first number
		System.out.print(n1+","+n2);

		// Iterate from 1 to the range
		for (int i = 2; i < range; i++) {

			// add first and second number assign to sum
			int n3=n1+n2;

			// print sum
			System.out.print(","+n3);
			n1=n2;// Assign second number to the first number
			n2=n3;// Assign sum to the second number


			
		
		}


	}

}


