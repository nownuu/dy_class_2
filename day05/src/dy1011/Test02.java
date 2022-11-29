package dy1011;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		// 4명의 국어, 영어 수학, 미술, 체육 점수를 입력하세요.
		Scanner sc = new Scanner(System.in);
		
		String sub [] = {"국어", "영어", "수학", "미술", "체육"};
		int score[][] = new int[5][5];
		int sum[] = new int[5];
		
		System.out.println("점수를 입력하세요>>");
		for(int i = 0; i<score.length; i++) {
			for(int j = 0; j<score.length; j++) {
				score[i][j] = sc.nextInt();
				sum[i] += score[i][j];
			}
		}
		
		for(int n = 0; n<score.length; n++) {
			System.out.println(" \n"+(n+1)+"번학생");
			for(int m =0; m<score.length; m++ ) {
				System.out.print(sub[m]+" 점수 : "+score[n][m]+"\t");
			}
			System.out.println("합 : "+sum[n]+", 평균 : "+sum[n]/sub.length);
		}
	}
}
