package chapter05;

public class SingletonName {
	
	public static void main(String[] args) {
		
		Singleton s = Singleton.getInstance();
		//s = new Singleton(); // 외부에서 인스터스 생성이 불가능
		s.printData();
		
		
		Singleton s1 = Singleton.getInstance();		
		Singleton s2 = Singleton.getInstance();		
		
	}

}
