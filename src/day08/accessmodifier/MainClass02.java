package day08.accessmodifier;

import day08.vo.MemberVO;

public class MainClass02 {
	public static void main(String[] args) {
		MemberVO memberVO = new MemberVO();
		
		memberVO.setId("abcd");
		memberVO.setPasswd("abcd123!@#");
		memberVO.setName("민개");
		memberVO.setPhoneNumber("010205687873");
		memberVO.setEmail("6gptod@naver.com");
		memberVO.setAddress("서울");
		memberVO.setBirth("980410");
		
		System.out.println("ID : " + memberVO.getId());
		System.out.println("패스워드 : " + memberVO.getPasswd());
		System.out.println("이름 : " + memberVO.getName());
	}
}
