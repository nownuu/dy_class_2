package basic;

import java.util.Scanner;

public class Test2_2 {
	public static void main(String[] args) {
		//1. 국어(korscore) 영어(enscore), 수학(mathscore)를 빈칸으로 분리하여 입력하시오.
		
		System.out.println("국어, 영어, 수학 점수를 입력하시오.");
		
		Scanner score = new Scanner(System.in);
		
		int korScore = score.nextInt();
		int engScore = score.nextInt();
		int mathScore = score.nextInt();
		
		System.out.println("국어 점수 : "+korScore);
		System.out.println("영어 점수 : "+engScore);
		System.out.println("수학 점수 : "+mathScore);
		
		int sum = korScore + engScore + mathScore;
		float avg = (float)sum / 3 ;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
