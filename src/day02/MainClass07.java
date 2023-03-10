package day02;
/*
 * [[참조형 데이터형(레퍼러스형)]]
 * 5. String 형(문자열)
 * 	- 선언하는 방법
 * 		String 변수명;
 * 	-문자열을 저장할 수 있다.
 * 
 * 기본형 - boolean, char, byte, short, int, long, float, double
 * 참조형 - 기본형을 제외한 모든 클래스
 * 
 */
public class MainClass07 {
	public static void main(String[] args) {
		String str = "안녕하세요.";
		System.out.println("str : " + str);
		
		String hello = "hello";
		System.out.println("1번 인덱스 : " + hello.charAt(1));
		System.out.println("2번 인덱스부터 4번 인덱스 전까지: " + hello.substring(2, 4));
		
		String addr = "서울 특별시 서대문구 신촌";
		boolean isContain = addr.contains("특별시");
		
		if(isContain) {
			System.out.println("addr 에는 특별시 라는 문자열이 있어요!");
		}
	}
}
