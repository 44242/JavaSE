package day09.Thread;
/*
 * synchronized - 동기화를 시켜주는 예약어
 * 
 * 
 * 
 */
import day09.mypac2.Brother;
import day09.mypac2.Sister;
import day09.mypac2.Wallet;

public class MainClass04 {
	public static void main(String[] args) {
		// Wallet 객체 생성하기
		Wallet wallet = new Wallet();
		
		// Sister 스레드 객체 생성
		Sister sister = new Sister(wallet);
		
		// Brother 스레드 객체 생성
		Brother brother = new Brother(wallet);
		
		sister.start();
		brother.start();
		
		System.out.println("메인스레드가 종료됩니다.");
	}
}
