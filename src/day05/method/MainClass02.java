package day05.method;

public class MainClass02 {
	public static String name;	// 전역변수 name 선언
	
	public static void main(String[] args) {

		setName("민개");
		System.out.println(name);
		
		int sum = sum(1, 2, 3);
		System.out.println(sum);
	}
	//인자 x 리턴 o
	public static String getName() {
		return name;
	}
	
	public static void setName(String name) {
		MainClass02.name = name;
	}
	//인자 x 리턴 o
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
}
