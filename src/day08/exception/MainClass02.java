package day08.exception;

import java.util.Random;

public class MainClass02 {
	public static void main(String[] args) {
		Random ran = null;
		// 정수 값을 저장할 지역 변수 초기화
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
		try {
			ran.nextInt();	//NullPointerExcption 에러 발생
			result = num1/num2;	//by zero 에러 발생
		} catch (Exception e) {
			System.out.println("예외가 발생하였습니다.");
		}
		
	}
}
