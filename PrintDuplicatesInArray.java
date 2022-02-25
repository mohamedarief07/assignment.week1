package assignment.week1;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		// get the length of the array
		System.out.println("length of the array is :" + arr.length);
		// declare an int variable named count
		int count;

		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int i = 0; i < arr.length; i++) {
			count = 0;// assign 0 to count
			for (int j = i + 1; j < arr.length - 1; j++) {// iterate from i to the length of the array by adding 1 to it
				// (inner loop starts here)
				if (arr[i] == arr[j]) {// compare both the loop variables & check they're equal
					count++;// increase the count if both the arrays are equal
				}
			}
			if (count > 0) {
				System.out.println(arr[i]);// Out of the inner loop, check and print the first array variable if count
				// is more than 0

			}
		}

	}

}
