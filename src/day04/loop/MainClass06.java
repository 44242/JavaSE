package day04.loop;
/*
 * continue문
 * 
 * 
 * 
 * 
 */
public class MainClass06 {
	public static void main(String[] args) {
		
		for(int j = 0; j < 5; j++) {
			for(int i = 0; i<5; i++) {
				if(i == 3) {
					continue;
			}
			System.out.println("i : " + i);
		}
	}
		}
}
