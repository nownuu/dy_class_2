package dy0920;

import java.util.Scanner;

public class Test2_2 {
	public static void main(String[] args) {
		//scanner 클래스를 이요하여 원화를 입력받아 달러로 바꾸기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위 : 원) >> ");
		int won = sc.nextInt();
		
		//$1 = 1100
//		float dollar = (float)won/1100; 의 경우 소수점이 길게 나옴 -> 해결 방법 무엇인지 알아보기.
		float dollar = (float)(won/1100);
		
		System.out.println(won+"원은 $"+dollar+"입니다.");
	}
}
