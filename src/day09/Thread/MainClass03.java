package day09.Thread;

import day09.mypac2.CountThread;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("메인 스레드가 시작됩니다.");
		CountThread cThread = new CountThread();
		
		cThread.start();// 카운트 스레드 시작!
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i*100);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("메인 스레드가 종료됩니다.");
	}
}