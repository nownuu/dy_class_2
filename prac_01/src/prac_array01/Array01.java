package prac_array01;

import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//배열 생성
		int num[] = new int[5];
		int sum = 0;
		for(int i = 0; i<num.length; i++) {
			System.out.println("정수 입력 >>");
			num[i] = sc.nextInt();
			sum += num[i];
		}
		
		//배열 출력 메시지
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println(sum);
		System.out.println((double)sum/num.length);
	}
}
