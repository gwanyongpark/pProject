package chapter07;

public class Person {
//	① 이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다.
//	② 인사하는 메소드를 정의해봅시다.
//	- “안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다.

	String name;
	int id;
	
	
	public Person() {}
	
	public Person(String name, int id){
		this.name = name;
		this.id = id;
		
		if() {
			
		}
	}
	
	
	
	
	
	void call() {
		System.out.print("안녕하세요. 저는 " + name + "입니다." + id + "살 입니다.");
	}
	
	
}
