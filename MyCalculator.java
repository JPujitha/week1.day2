package week.Day2.Assignment;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		
		int Add = obj.add();
		System.out.println("Addition of numbers is :"+Add);
		
		int Substraction = obj.sub(100,10);
		System.out.println("Substraction of numbers is :"+Substraction);
		
		double Multiplication = obj.mul(2.345, 2.553);
		System.out.println("Multiplication of numbers is :"+Multiplication);
		
		float disvision = obj.divide(12.05f, 10.05f);
		System.out.println("Disvision of numbers is :"+disvision);
	}

}
