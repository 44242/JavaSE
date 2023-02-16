package day08.vo;
/*
 * [[ VO (Value Object, DTO(Data Transfer Object) ]]
 * 	값 오브젝트로써 목적의 맞는 변수의 집합.
 * 	DataBase 값 운반용으로 사용.
 * 
 * 	캡슐화(정보 은닉) - 객체의 속성과 행위를 하나로 묶고, 외부로부터 내부를 감싸 숨겨 은닉한다.
 * 
 */

// 회원 객체
public class MemberVO {
	private String id;
	private String passwd;
	private String name;
	private String phoneNumber;
	private String email;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	private String address;
	private String birth;
}
