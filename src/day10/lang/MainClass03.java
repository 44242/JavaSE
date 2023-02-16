package day10.lang;
/*
 * [[ 래퍼 클래스(Wrapper Class) ]]
 * 	8개의 기본타입에 해당하는 데이터를 객체로 표현.
 * 
 * 
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		boolean b = true;
		Boolean b2 = new Boolean(true);
		Boolean b3 = new Boolean(true);
		
		Boolean b4 = Boolean.valueOf(true);
		
		if(b4) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println(b);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		// int Wrapper Class
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(10);
		int num3 = 10;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		System.out.println("num1 == num3 = " + (num1==num3));
		System.out.println("num1 == num2 = " + (num1==num2));
		
	}
}
