package dy0920;

import java.util.Scanner;
//20221021_박소현_220920
/*
 * 1. 단순 if문
 * 2. if - else문
 *  **/

public class Ex2_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력하시오 : ");
		int num = sc.nextInt();
		
		if(num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		sc.close(); //scanner.close();로 하면 오류
	}
}
