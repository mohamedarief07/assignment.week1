package assignment.week1;

public class ConvertNegativeToPositiveNo {
	public static void main(String[] args) {
		
	
	int num=-40;//Initialize an integer with a negative number	   like, int number = -40;
	if(num<0)
	{
		//Check if the number is a negative number Hint : any number that is lesser than zero is a negative number
		//If so, convert the number to a positive numer
		int convert=num*(-1);
		System.out.println("The number "+num+" is converted to " +convert);
	}
	else {
		System.out.println(num+ ": is not a negative number");
	}
	}
}
