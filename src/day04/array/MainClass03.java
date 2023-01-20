package day04.array;

import java.util.Iterator;

public class MainClass03 {
	public static void main(String[] args) {
		// new 연산자 사용하지 않고 직접 배열 값 대응하기
		String[] name = {"피카츄", "라이츄", "파이리", "꼬부기", "야도란"};
		
		// 배열의 내용 출력해보기
		for(int i = 0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
		//확장 for문
		for(String tmp : name) {
			System.out.println(tmp);
		}
	}
}
