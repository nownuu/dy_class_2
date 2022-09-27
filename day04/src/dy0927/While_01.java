package dy0927;

import java.util.Scanner;

public class While_01 {
	public static void main(String[] args) {
		//while문
//		int i = 0;
//		
//		while(i<10) {
//			System.out.print(i+" ");
//			i++;
//		}
		
		//=====================
		// -1이 입력될 때까지 입력된 수의 평균 구하기
		int count = 0;
		int sum = 0;

		System.out.println("정수를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		while (num != -1) {
			sum += num;
			count++;
			System.out.println("정수를 입력하세요.");
			num = scan.nextInt();
		}
		
		if(count == 0 ) {
			System.out.println("입력된 수가 없습니다.");
		} else {
			System.out.println("입력된 정수의 개수는 "+count+"개 입니다.");
			System.out.println("입력된 정수의 평균은 "+(double)sum/count+"입니다.");
		}
	}
}
