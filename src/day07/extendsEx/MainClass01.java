package day07.extendsEx;

import day07.mypac.Cat;
import day07.mypac.PersianCat;

/*
 * 
 * [[ 상속 ]]
 * 	부모 클래스(상위 클래스)와 자식 클래스(하위 클래스)가 있으며,
 * 	자식 클래스는 부모 클래스를 선택해서,
 * 	그 부모의 맴버를 상속 받아 그래도 쓸 수 있게 된다.
 * 
 * 	클래스 1개 당 상속 1개
 * 
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		
		// 고양이 이름 지어주기
		cat.setName("나비");
		String catName = cat.getName();
		System.out.println(catName);
		
		cat.likeChur();
		
		PersianCat pCat = new PersianCat();
		pCat.getColor();
		pCat.setName("권선초병설유치원");
		System.out.println(pCat.getName());
		
		//모든 클래스의 최상위 부모이다.
		Object obj = new Object();
	}
}
