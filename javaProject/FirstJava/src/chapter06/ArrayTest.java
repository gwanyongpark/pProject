package chapter06;

public class ArrayTest {

	public static void main(String[] args) {
		
		// 배열의 선언
		int[] scores; // int 타입의 배열 인스턴스 주소를 가지는 변수
		
		// 배열의 생성
		scores = new  int[10]; // int 타입의 요소 10개를 가지는 배열 인스턴스 생성
		
		// 기본값으로 초기화
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[1]);
		}
		
		System.out.println("=============");
		
		// 배열 요소의 참조
		// 배열이름[index]
		// index => 0 ~ 개수-1
		// 요소의 개수 => 배열변수.length
		
		scores[0] = 60;
		scores[1] = 75;
		scores[2] = 45;
		scores[3] = 60;
		scores[4] = 90;
		scores[5] = 85;
		scores[6] = 70;
		scores[7] = 50;
		scores[8] = 100;
		scores[9] = 80;
		//scores[10] = 80;
		
		// 총합
		int sum = 0;
		// 평균
		float avg = 0.0f;
		
		//System.out.println(scores[1]);
		// index => 0~9
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
			// 합의 연산
			sum = sum + scores[i];
		}
		
		avg = sum/(float)scores.length;
		//(float) <- 소수점까지 표현하기 위해
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		
		

	}

}
