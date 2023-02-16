package day03.operator;
/*
 * [[ 연산자 ]]
 * 1. 산술 연산자
 * 	+, -, *, /
 * 
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		int sum = num1 + num2;
		System.out.println(sum);
		
		int add = num1 - num2;
		System.out.println(add);
		
		int mul = num1 * num2;
		System.out.println(mul);
		
		int div = num1 / num2;
		System.out.println(div);
		
		int a = 9 % 5;
		System.out.println(a);
		
		double resultDouble = 10/0.3;
		System.out.println(resultDouble);
	}
}
