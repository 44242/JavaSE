package day02;
/*
 * [[기본 자료형]]
 * 2. 문자형(char)
 * - 전 세계에서 쓰이는 문자 형태 대부분 표현 가능.
 * - 선언하는 방법
 * 	char 변수명;
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		// char 형 변수 선언과 동시에 값 대입하기
		char ch1 = 'A';
		
		System.out.println("char 형 변수에 저장된 문자: " + ch1);
		
		char ch2 = '金';
		char ch3 = '쀍';
		
		int num = ch1;
		System.out.println(num);
		
		char ch4 = 66;
		System.out.println(ch4);
	}
}
