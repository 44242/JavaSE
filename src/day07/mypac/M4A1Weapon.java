package day07.mypac;

public class M4A1Weapon implements Weapon, Scope{

	@Override
	public void doSnip() {
		System.out.println("사거리 1000 저격 공격해요");
	}
	
	@Override
	public void attack() {
		System.out.println("80 데미지 공격해요");
	}
	
}
