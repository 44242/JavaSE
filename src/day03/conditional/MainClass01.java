package day03.conditional;
/*
 * [[ 조건문 ]]
 * 	주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 제어하는 명령문
 * 
 * 	if문 사용법
 * 
 * 	if(조건식1) {
 * 		조건식 true 일 때 실행 명령문
 * }else if(조건식2){
 * 		조건식1이 false 조건식2가 true 일 때 실행 명령문
 * }else{
 * 		조건식1 false 조건식2 false일 때 실행 명령문
 * }
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		int num = 11;
		if(num%2 == 0) {
			System.out.println("num은 짝수 입니다.");
		}else {
			System.out.println("num은 홀수 입니다.");
		}
	}
}
