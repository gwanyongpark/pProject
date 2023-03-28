package chapter05.phone;

public class Member {

	// 변수
	String name;
	String email;
	int age;
	String phoneNumber;
	SmartPhone phone;
	
	
	public Member(String name, String email, int age, String phonenumber, SmartPhone phone) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.phoneNumber = phonenumber;
		this.phone = phone;
		//단축키 : shift + alt + s -> generate constructor using fields
		
	}


	public Member(String name, String email) {
		super();
		this.name = name;
		this.email = email;
		this.age = 20;
		this.phoneNumber = "입력데이터가 없습니다.";
		this.phone = new SmartPhone();
	}
	
	public void showData() {
		System.out.println("이름 : " + name);
		System.out.println("이메일 : " + email);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + phoneNumber);
		this.phone.call();
		
	}
	
	
	
	
	
	
}
