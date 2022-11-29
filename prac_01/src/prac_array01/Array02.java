package prac_array01;

import java.util.Scanner;

public class Array02 {
	public static void main(String[] args) {
		// 2차원 배열생성
		
		Scanner sc = new Scanner(System.in);
		String sub[] = {"국어", "영어", "수학"};
		int sum[] = new int[5];
		int score [][] = new int[5][3];
		
		for(int i = 0; i<score.length; i++) {
			for(int j = 0; j<score[i].length; j++) {
				score[i][j] = sc.nextInt();
			sum[i] += score[i][j];
			}
		}
		
		for(int i = 0; i<score.length; i++) {
			System.out.println((i+1)+"번 학생\t");
			for(int j = 0; j<score[i].length; j++) {
				
				System.out.print(sub[j]+" "+score[i][j]+"\n");
			}
			System.out.println(sum[i]);
		}
	}
}
