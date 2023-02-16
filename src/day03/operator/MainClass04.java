package day03.operator;
/*
 * 4. 논리 연산자
 * 	&& : And 조건, 교집합 개념, 양쪽 모두 true 일 때만 true
 * 	|| : Or 조건, 합집합의 개념, 어느 한 쪽이 true 이면 true
 * 	!  : not 조건, 여집합 개념, 논리값을 반전 시킨다.
 * 
 */
public class MainClass04 {
	public static void main(String[] args) {
		boolean result = true && true;
		System.out.println("&& : " + result);
		
		result = true || false;
		System.out.println("|| : " + result);
		
		result = !false;
		System.out.println("! : " + result);
		
		String order = "의류";
		
		if(order.equals("식품") || order.equals("의류") || order.equals("자동차")) {
			System.out.println("식품/의류/자동차 주문하였습니다.");
		}
	}
}
