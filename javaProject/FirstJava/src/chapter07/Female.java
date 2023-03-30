package chapter07;

public class Female extends Person {
	
	int age;
	
	public Female() {}
	
	public Female(String name, int age) {
		this.age = age;
	
	}
	
	
	@Override
	void call(){
		super.call();
		System.out.print(age + "살 입니다.");
	}
	
	public static void main(String[] args) {
		
		Female f = new Female();
		
		f.name = "김연아";
		f.age = 25;
		f.call();
		
	}
}

