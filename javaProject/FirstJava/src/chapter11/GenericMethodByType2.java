package chapter11;

import chapter07.Phone;

public class GenericMethodByType2 {
	
	public <T extends Phone> void introduce(T t) {
		System.out.println("안녕하세요." + t.toString());
	}
	
	public static void main(String[] args) {
		GenericMethodByType2 byType = new GenericMethodByType2();
		
		Phone p = new Phone("010-1111-2222");
		
	//	byType.<String>introduce("1");
		byType.introduce(p);

	}

}
