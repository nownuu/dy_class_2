package basic;

import java.util.Scanner;

/*
 * 문자열(String)은 기본 타입이 아님
 * 문자열 리터럴 / /문자열이 섞인 + 연산 -> 문자열을 연결
 * System.out.println(toolName + "이 출시됨") = 문자열 출력
 *
 * System.in = 키보드로부터 직접 읽는 자바의 표준 입력 스트림
 *                      = 키 값을 바이트(문자 아님)로 리턴
 * Scanner 클래스 = system.in 에게 키를 읽게 하고, 읽은 바이트를 문자, 정수, 실수 불린, 문자열 등 다양한 타입으로 변환하여 리턴
 * **/



public class Scan {
	public static void main(String[] args) {
		System.out.println("이름, 나이를 빈캄으로 분리하여 입력하시오");
		Scanner person = new Scanner(System.in);  //scanner 객체 생성
		// Scanner에서 키 입력 받기 = 입력되는 키 값을 공백으로 구분되는 아이템 단위로 읽음
		// 공백 문자 (\t, \f, \r, ' ', \n)
		
		String name = person.next();
		System.out.println("이름 : "+name);
		
		int age = person.nextInt();
		System.out.println("나이 : "+age);
	}
}