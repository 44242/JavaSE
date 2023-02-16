package day09.Thread;

public class MainClass06 {
	public static void main(String[] args) {
		new Thread(
			new Runnable() {	// 익명클레스
			public void run() {
				System.out.println("익명스레드가 시작되었습니다.");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("익명 스레드가 종료됩니다.");
			}
		}).start();
		
		System.out.println("메인스레드가 종료됩니다.");
	}
}
