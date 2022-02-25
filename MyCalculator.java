package assignment.week1;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		
		int add = obj.add(12, 13, 15);
		System.out.println("Addition:" +add);
		
		int sub = obj.sub(80, 41);
		System.out.println("Subraction:" +sub);
		
		double mul = obj.mul(12.23434, 12.4343);
		System.out.println("Multiplication:" +mul);
		
		float divide = obj.divide(21.1F, 3.1F);
		System.out.println("Division:" +divide);
	}

}
