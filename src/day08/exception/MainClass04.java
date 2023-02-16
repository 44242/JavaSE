package day08.exception;

public class MainClass04 {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("익셉셥 발생");
			} 	//2초 일시정지
		}
		
	}
}
