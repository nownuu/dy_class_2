package dy0920;

import java.util.Scanner;
//20221021_박소현_220920
/*
 * char = 1byte = ' '
 * String = 4byte → 참조하는 주소를 가지고 있음 (참조 주소)= ""
 * ==================================================
 *  swich - case문
 * **/
public class Ex2_12 {
	public static void main(String[] args) {
		char grade; //1byte
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오 (0-100) : ");
		int score = sc.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >=80) {
			grade = 'B';
		} 	else if(score >=70) {
			grade = 'C';
		}  else if(score >=60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("if문으로 작성한 학점은 "+grade+"입니다.");

		
		//==================================
		//추가 switch문 == 결과는 동일
		switch(score/10) {
		case 10: //score = 100 - break가 없음
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println("switch문으로 만든 학점은 "+grade+"입니다.");
		
		sc.close();
	}
}
