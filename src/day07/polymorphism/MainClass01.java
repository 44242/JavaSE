package day07.polymorphism;

import day07.mypac.AKWeapon;
import day07.mypac.M16;
import day07.mypac.M4A1Weapon;
import day07.mypac.Scope;
import day07.mypac.Weapon;

/*
 * [[ 다형성 (polymorphism) ]]
 * 	하나의 객체가 여러가지 타입을 가질 수 있는 것을 의미한다.
 * 
 * instanceof 연산자
 * 	객체가 특정 클래스를 상속받고 있는지 boolean으로 반환.
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		AKWeapon ak = new AKWeapon();
		ak.attack();
		ak.doSnip();
		
		Weapon m4a1 = new M4A1Weapon();
		m4a1.attack();

		M4A1Weapon m4Real = (M4A1Weapon)m4a1;
		m4Real.attack();
		m4Real.doSnip();
		
		//m4a1 m4Real 같을까요? 다를까요? 정답은 같다.
		System.out.println(System.identityHashCode(m4a1));
		System.out.println(System.identityHashCode(m4Real));
		System.out.println(System.identityHashCode(ak));
		
		// m4a1 m4Real 같은데 왜? m4a1은 doSnip 안되는가? => 다형성 때문에!
	
		M16 m16 = new M16();
		
		classifyWeapon(m16);
		classifyWeapon(m4a1);
		classifyWeapon(m4Real);
		classifyWeapon(ak);
	}
	
	//소총 구분하는 메소드
	public static void classifyWeapon(Weapon weapon) {
		if(weapon instanceof Scope) {
			System.out.println("저격소총 입니다.");
		}else {
			System.out.println("일반소총 입니다.");
		}
	}
}
