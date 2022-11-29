package dy1011;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 베열 (array)
 * 인덱스와 인덱스에 대응하는 데이터들로 이루어진 자료 구조
 * 같은 타입의 데이터들이 순차적으로 저장
 * 배열 인덱스 = 0부터 시작
 * 
 * 10개의 정수로 구성도니 배열을 사용하는 경우
 * int n[] = new int [10];
 *  [] n도 가능함
 *  
 *  래퍼런스 변수(n) = 참조하는 주소값이 들어가는 변수
 * 
 * int (4byte) 100이 입력되면 0 주소 100 || 1 주소 104 || 2 주소 108
 * double (8byte)  100이 입력되면 0 주소 100 || 1 주소 108 || 2 주소 116
 * 
 * 배열 원소 접근 
 * 배열 변수명과 [] 사이에 원소의 인덱스를 적어 접근
 * */

public class Array01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num[] = {4, 55, 32, 28, 35, 2, 99, 13, 43, 65};
		int sum = 0;
		
		for(int i = 0; i<10 ; i++) {
//			num[i] = sc.nextInt();
			sum += num[i];
		}
		
//		Arrays.sort(num);
		
		for(int i = 0; i<num.length ; i++) {
			System.out.print("입력된 정수 : "+num[i]+" \n");
		}
		System.out.println("입력된 정수들의 합 : "+sum + ", 평균 : "+(double)sum/10);
	}
}
