package chapter07;

public class Male extends Person {
	
	int age;
	
	public Male() {}
	
	public Male(String name, int age) {
		this.age = age;
	
	}
	
	
	
	@Override
	void call(){
		super.call();
		System.out.print(age + "살 입니다.");
	}
	
	public static void main(String[] args) {
		
		Male m = new Male();
		
		m.name = "손흥민";
		m.age = 20;
		m.call();
		
	}
}

