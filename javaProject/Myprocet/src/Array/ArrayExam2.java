package Array;

public class ArrayExam2 {

	public static void main(String[] args) {
		// Student 타입의 배열 생성 : 데이터 10개 저장가능
		Student[] students = new Student[10];
		students[0] = new Student("son01", 100, 80, 80);
		students[1] = new Student("son02", 50, 70, 90);
		students[2] = new Student("son03", 80, 40, 70);
		students[3] = new Student("son04", 90, 50, 60);
		students[4] = new Student("son05", 70, 100, 80);
		students[5] = new Student("son06", 60, 60, 70);
		students[6] = new Student("son07", 80, 80, 90);
		students[7] = new Student("son08", 60, 90, 80);
		students[8] = new Student("son09", 70, 50, 90);
		students[9] = new Student("son10", 100, 90, 70);
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===========================================");
		for(Student student : students) {
			System.out.println(student.result());
		}
		

	}

}
