package day05.method;

import java.net.MulticastSocket;

/*
 * [[ 메소드(method]]
 * 	어떤 특정 작업을 수행하기 위한 명령문의 집합.
 * 
 * 	(접근제어자) (정적) 반환타입 메소드이름(매개변수 타입 매개변수 명){		//선언부
 * 		실행할 코드(명령문)		// 구현부
 * 		
 * 		return 반환 값;		//void 일 때 생략 가능	
 * 	}
 * 	오버로딩(overloading)
 * 		메소드 명이 같아도, 매개변수 개수, 또는 타입이 다르면 사용가능.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//hello 메소드 호출하기
		hello();
		//printName 메소드 호출하기
		printName("민개");
		printName("민개", "짱");
	}
	//인자(매개변수)x 리턴 x -> 호출 시 싱핼하고 끝나는 메소드
	public static void hello() {
		System.out.println("Hello, World");
	}
	
	// 인자 o 리턴 X
	public static void printName(String name) {
		System.out.println("이름 : " + name);
	}
	
	//오버로딩(overloading)
	public static void printName(String firstName, String lastName) {
		System.out.println("이름 : " + firstName);
		System.out.println("성 : " + lastName);
	}
	//오버로딩
	//인자 o 리턴 x
	public static void printName(int age) {
		System.out.println("나이 : " + age);
	}
}
