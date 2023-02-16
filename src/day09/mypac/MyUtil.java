package day09.mypac;

public class MyUtil {
	public String name = "MyUtil";
	public static String staticName = "마이유틸";
	
	// 내부 클래스
	public class HelloPrinter{
		public void printHello() {
			System.out.println("내부 클래스의 HelloPrinter 입니다.");
		}
	}
	
	public static class Calculator{
		
		public void calc(int a, int b) {
			int result = a + b;
			System.out.println("전달 받은 두 정수의 합: " + result);
			System.out.println("static 내부 클래스 Calculator 입니다.");
		}
	}
}
