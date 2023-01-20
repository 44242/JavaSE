package day04.loop;

public class MainClass04 {
	public static void main(String[] args) {
//		for(int i = 0; i < 7; i++) {
//			for(int j = 0; j < 7; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		for(int i = 0; i < 7; i++) {
			for(int j = -1; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	
	}
}
