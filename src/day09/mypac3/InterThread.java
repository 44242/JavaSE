package day09.mypac3;

public class InterThread extends Object implements Runnable{

	@Override
	public void run() {
		System.out.println("InterThread가 시작되었습니다.");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("InterThread가 종료됩니다.");
	}

}
