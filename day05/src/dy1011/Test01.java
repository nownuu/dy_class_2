package dy1011;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		// 국어, 영어 수학, 미술, 체육 점수를 입력하세요.
		Scanner sc = new Scanner(System.in);
		
		String sub [] = {"국어", "영어", "수학", "미술", "체육"};
		int score[] = new int[5];
		int sum = 0;
		
		System.out.println("점수를 입력하세요>>");
		for(int i = 0; i<score.length; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
		}
		
		for(int j = 0; j<sub.length; j++) {
			System.out.println(sub[j]+" 점수 : "+score[j]);
		}
		System.out.println("점수 합 : "+sum+", 평균 : "+(float)sum/sub.length);
	}
}
