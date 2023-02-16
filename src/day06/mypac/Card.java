package day06.mypac;

public class Card {
	// 정적/기본형/전역
	public static int width = 62;
	public static int height = 88;
	
	public String type = "spade";
	public String number = "A";
	
	public String getType() {
		System.out.println(type);
		return type;
	}
}
