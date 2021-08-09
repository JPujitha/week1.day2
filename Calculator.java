package week.Day2.Assignment;

public class Calculator {
	int num1 = 20;
	int num2 = 40;
	int num3 = 60;

//add(int num1, int num2, int num3), it should return sum of num1+num2+num3
	//here i wanted to declare my variable values so not passing the arguments//
	public int add() {
		int sum = num1 + num2 + num3;
		return sum;
	}

//sub(int num1, int num2), it should return subtraction of of num1-num2
	public int sub(int num1, int num2) {
		int s = num1 - num2;
		return s;
	}

//mul(double num1, double num2), it should return product of num1 * num2
	public double mul(double num1, double num2) {
		double m = num1 * num2;
		return m;
	}

//divide(float num1, float num2), it should return division of num1 / num2
	public float divide(float num1, float num2) {
		float d = num1 % num2;
		return d;
	}
}
