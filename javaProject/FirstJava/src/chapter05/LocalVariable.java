package chapter05;

public class LocalVariable {
	
	void method(int num) {
		// 매개변수 => 지역변수로 메소드 호출 시에  생성 -> 메소드 종료 시에 소멸
		
		// 메소드 블록 안에서 선언되는 변수도 지역변수
		// 선언시점에 메모리 생성 -> 메소드 종료 시 소멸
		int lv = 10;
		
		if(lv>10) {
			boolean chk = true;
			System.out.println(chk);
		} else {
			boolean chk = false;
			System.out.println(chk);
		}
		//System.out.println(chk); // chk 변수는 if 블록 내에서만 사용가능한 변수
		
		int i = 0;
		
		for(i=0; i<5; i++) {
			System.out.println(i);
		}
		System.out.println(i);
		
		while(lv<5) {
			int lv2 = 100;
			System.out.println(lv2);
			lv++;
		}
		
		System.out.println(lv);
		
	}

	void method2(int num) {
		int lv = 10;
	}
	
	
	
	
}
