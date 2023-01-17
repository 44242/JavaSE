package day02;
/*
 * [[형변환(Cast)]]
 * 1. 업캐스팅(프로모션)
 * 	- 표현 범위가 더 큰 데이터형으로 변환하기
 * 	- 자동으로 된다.
 * 	- 데이터 손실이 없다.
 * 
 * 2. 다운 캐스팅
 * 	- 표현 범위가 더 작은 데이터형으로 변환하기
 * 	- 명시적으로 해야한다.
 * 	- 데이터 손실이 있을 수 있다.	
 */
public class MainClass06 {
	public static void main(String[] args) {
		//업캐스팅(프로모션) 예
		byte iByte = 10;
		int iInt = iByte; // 자동으로 형변환이 된다.
		
		float ifloat = 10.1f;
		double idouble = ifloat;
		
		//다운캐스팅 예
		float ifloat2 = (float)idouble;
		System.out.println("ifloat2 : " + ifloat2);
		
		int iint2 = (int)idouble;
		System.out.println("iint2 : " + iint2);
	}
}
