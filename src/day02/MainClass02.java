package day02;
/*
 * [[기본 자료형]]
 * 1. 논리형(boolean)
 * 
 * - 선언 방법
 * 	boolean 변수명;
 * - 가질 수 있는 범위
 * true, false 두 가지 값 저장 가능.
 * 
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		//논리형 지역 변수 선언하기
		boolean isWait;
		//선언한 변수에 값 대입하기
		isWait = true;
		//저장된 값을 문자열로 출력하기
		System.out.println("논리형 변수에 저장된 값: " + isWait);
		
		int age = 20;
		
		boolean isAdult = age > 19;
		if(isAdult) {
			System.out.println("성인 입니다.");
		}else {
			System.out.println("미성년자 입니다.");
		}
	}
}
