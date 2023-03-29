package Array;

public class ArrayExam1 {

	public static void main(String[] args) {
		
		// 국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고,
		// 평균 점수를 출력하는 프로그램을 작성해봅시다. 
		String[] sName = {"A", "B"};
		int[] korScore = {100, 90, 80, 70, 60, 50, 40, 30, 20, 100};
		int[] engScore = {80, 70, 100, 50, 60, 90, 40, 60, 20, 80};
		int[] mathScore = {60, 50, 80, 70, 90, 50, 40, 100, 20, 30};
		
		System.out.println("국어 \t영어 \t수학 \t총점 \t평균");
		//System.out.println(korScore[0] + "\t" + engScore[0] + "\t" + mathScore[0] + "\t");
//		for(int i=0; i<10; i++) {
//			int sum = korScore[i] + engScore[i] + mathScore[i];
//			float avg = sum/3f;
//			System.out.println(korScore[i] + "\t" + engScore[i] + "\t" + mathScore[i] + "\t" + sum + "\t" + avg);
//		}
		
		
		
		
		
		int[][] scores = {
				{100, 90, 80},
				{90, 50, 60},
				{80, 60, 100},
				{70, 40, 80},
				{60, 40, 50},
				{50, 80, 70},
				{80, 50, 80},
				{70, 90, 60},
				{40, 80, 50},
				{90, 40, 80}
		};
		
		for(int i=0; i<scores.length; i++) {
			int sum = 0;
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
				sum += scores[i][j];
			}
			System.out.print(sum + "\t");
			System.out.print(sum/(float)scores[i].length);
			System.out.println();
		}
		
		
		
		
		
	}

}
