package chapter06;

public class StudentMain {
	
	//① Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
	//② Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
	//③ 배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다

	public static void main(String[] args) {
		Student[] students = new Student[10];
		
		students[0] = new Student("가", 90, 80, 70);
		students[1] = new Student("나", 91, 81, 71);
		students[2] = new Student("다", 92, 82, 72);
		students[3] = new Student("라", 93, 83, 73);
		students[4] = new Student("마", 94, 84, 74);
		students[5] = new Student("바", 95, 85, 75);
		students[6] = new Student("사", 96, 86, 76);
		students[7] = new Student("아", 97, 87, 77);
		students[8] = new Student("자", 98, 88, 78);
		students[9] = new Student("차", 99, 89, 79);
		
		

	}

}
