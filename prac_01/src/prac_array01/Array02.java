package prac_array01;

import java.util.Scanner;

public class Array02 {
	public static void main(String[] args) {
		// 2���� �迭����
		
		Scanner sc = new Scanner(System.in);
		String sub[] = {"����", "����", "����"};
		int sum[] = new int[5];
		int score [][] = new int[5][3];
		
		for(int i = 0; i<score.length; i++) {
			for(int j = 0; j<score[i].length; j++) {
				score[i][j] = sc.nextInt();
			sum[i] += score[i][j];
			}
		}
		
		for(int i = 0; i<score.length; i++) {
			System.out.println((i+1)+"�� �л�\t");
			for(int j = 0; j<score[i].length; j++) {
				
				System.out.print(sub[j]+" "+score[i][j]+"\n");
			}
			System.out.println(sum[i]);
		}
	}
}
