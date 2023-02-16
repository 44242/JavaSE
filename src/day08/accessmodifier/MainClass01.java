package day08.accessmodifier;

import day08.mypac.CellPhone;
import day08.mypac.Phone;
import day08.mypac2.SmartPhone;

/*
 * 
 * [[ 접근 제어자 ]]
 * 		public - 모든 클래스에서 접근 가능.
 * 		protected -  같은 패키지 또는 상속 관계에서 접근 가능.
 * 		default - 같은 패키지 접근 가능.
 * 		private - 같은 클래스 안에서 접근 가능.
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		
		Phone phone = new Phone();
		CellPhone cp = new CellPhone();
		SmartPhone sp = new SmartPhone();
		
		System.out.println("모델명 : " + phone.model);
		System.out.println("모델명 : " + cp.model);
		System.out.println("모델명 : " + sp.model);
		
		sp.videoMessage();
		
	}
}
