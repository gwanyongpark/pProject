package chapter06;

public class Student {


		//① 학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다.
		//② 변수는 캡슐화를 합니다. getter/setter 메소드를 정의합니다.
		//③ 총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.
		
		
		String StudentName;
		private int StudentKor;
		private int StudentEng;
		private int StudentMath;
		
		public Student(String studentName, int studentKor, int studentEng, int studentMath) {
			super();
			StudentName = studentName;
			StudentKor = studentKor;
			StudentEng = studentEng;
			StudentMath = studentMath;
		}

		
		
		public String getStudentName() {
			return StudentName;
		}


		public void setStudentName(String studentName) {
			StudentName = studentName;
		}


		public int getStudentKor() {
			return StudentKor;
		}


		public void setStudentKor(int studentKor) {
			StudentKor = studentKor;
		}


		public int getStudentEng() {
			return StudentEng;
		}


		public void setStudentEng(int studentEng) {
			StudentEng = studentEng;
		}


		public int getStudentMath() {
			return StudentMath;
		}


		public void setStudentMath(int studentMath) {
			StudentMath = studentMath;
		}


		
		
		
		
		
		
		

		@Override
		public String toString() {
			return "Student [학생이름=" + StudentName + ", 국어점수=" + StudentKor + ", 영어점수=" + StudentEng
					+ ", 수학점수=" + StudentMath + "]";
		}
		
		



}
