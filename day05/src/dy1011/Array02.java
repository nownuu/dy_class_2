package dy1011;

import java.util.Arrays;
import java.util.Scanner;

/*
 * toSring() == 메소드 / string 타입으로 결과값을 보여줌
 * .length = 변수 필드(field) : int 타입
 * 
 * void = 결과값을 나에게 주지 않음
 * */

public class Array02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];
		int sum = 0;
		int max = 0;
		System.out.println("5개 정수를 입력 하세요 >>");
		for(int i = 0; i<num.length ; i++) {
			num[i] = sc.nextInt();
			
			if(max < num[i]) {
				max = num[i];
			}
		}
		
		Arrays.sort(num);
		
		System.out.println("입력된 정수 >>");
		for(int i = 0; i<num.length ; i++) {
			System.out.print(num[i]+" \t");
		}
		
		System.out.println("\n가장 큰 수 = "+max);
		
		sc.close();
	}
}
