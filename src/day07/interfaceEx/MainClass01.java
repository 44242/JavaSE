package day07.interfaceEx;

import day07.mypac.AKWeapon;
/*
 * [[ 인터페이스 (interface) ]]
 * 	추상메소드만 존재한다.
 * 	변수 선언을 해도 변수가 아닌 상수가 된다.
 * 	다중 상속 가능!
 * 
 * 	구조(뼈대)를 만들어준다.
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		AKWeapon ak47 = new AKWeapon();
		ak47.attack();
		System.out.println(ak47.NAME);
		
		ak47.doSnip();
	}
}
