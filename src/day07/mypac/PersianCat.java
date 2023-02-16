package day07.mypac;

public class PersianCat extends Cat{
	public void getColor() {
		System.out.println("하얗다!!");
	}
	
	@Override
	public void move() {
		System.out.println("우아하게 움직인다.");
	}

}
