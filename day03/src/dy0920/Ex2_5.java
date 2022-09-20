package dy0920;

import java.util.Scanner;
//20221021_박소현_220920
/*
 * 연산 : 주어진 식을 계산하여 결과를 얻어내는 과정 → 연산자 우선순위 존재(괄호 = 최우선순위)
 * 산술 연산자
 * 	더하기, 빼기, 곱하기, 나누기(/), 나머지(%)
 * **/
public class Ex2_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요."); //초 입력 받기
		int time = sc.nextInt();
		
		int second = time % 60;
		int minute = (time/60) % 60;
		int hour = (time/60) / 60;
		
		System.out.println(time +"초는 ");
		System.out.print(hour +"시간 ");
		System.out.print(minute +"분 ");
		System.out.print(second +"초입니다.");
		
		sc.close();
	}
}
