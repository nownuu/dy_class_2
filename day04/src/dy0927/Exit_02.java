package dy0927;

import java.util.Scanner;

public class Exit_02 {
	public static void main(String[] args) {
		// 숫자만큼 정수를 입력하고 그 합계와 평균 개수를 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수의 개수를 입력하세요 >>");
		
		int nCount = scan.nextInt();
		
		System.out.println("해당 개수만큼 정수를 입력하세요 >>");
		int sum = 0;
		
		for(int i = 0; i<nCount; i++) {
			int num = scan.nextInt();
			sum += num;
		}
		System.out.println("합계 = "+sum+" 평균 = "+(double)sum/nCount+" 개수 = "+nCount);
	}
}
