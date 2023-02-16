package day07.mypac;
/*
 * TODO
 * 1. 빵종류
 * 2. 케잌 종류
 * 3. 음료
 * 
 * 4. 빵굽기
 * 5. 카페
 * 6. 카운트
 * 
 */
public class Bakery {
	// 빵류 객체
	public Bread bread;
	
	// 케이크류 객체
	public Cake cake;
	
	// 커피류 객체
	public Coffee coffee;
	
	public Bakery(Bread bread, Cake cake, Coffee coffee) {
		this.bread = bread;
		this.cake = cake;
		this.coffee = coffee;
		System.out.println("빵집 오픈하였습니다.");
	}
	
	
	public static void main(String[] args) {
		CreamBread cb = new CreamBread();
		System.out.println("빵이름 : " + cb.breadName);
		System.out.println("빵가격 : " + cb.breadPrice);
		
		ChocoCake cc = new ChocoCake();
		System.out.println("케잌 이름 : " + cc.cakeName);
		System.out.println("케잌 가격 : " + cc.cakePrice);
		
		americano ac = new americano();
		System.out.println("커피 이름 : " + ac.coffeeName);
		System.out.println("커피 가격 : " + ac.coffeePrice);
		
		Bakery bakery = new Bakery(cb, cc, ac);
		
		
		System.out.println("빵 이름 : " + bakery.bread.breadName);
	}
	
}
