package day09.innerclass;

import day09.mypac.Soldier;
import day09.mypac.Weapon;

public class MainClass04 {
	public static void main(String[] args) {
		
		Soldier s = new Soldier(new Weapon() {
		
			@Override
			public void attack() {
				System.out.println("솔져 공격!!!");
			}
		});
		
		s.w.attack();
		
 }
}
