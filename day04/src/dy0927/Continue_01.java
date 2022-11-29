<<<<<<< HEAD
package dy0927;

import java.util.Scanner;

public class Continue_01 {
	public static void main(String[] args) {
		//5개의 정수를 받고 그 중 양수들만 합하여 출력
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		System.out.println("정수 5개를 입력하세요 >>");
		
		for(int i = 0; i<5; i++) {
			int n = scan.nextInt(); //정수 입력
			
			if(n <= 0) {
				continue;
			} else {
				sum += n;
			}
		}
		System.out.println("입력된 정수의 합계는 : ");
		System.out.println(sum);
		scan.close();
	}
}
=======
package dy0927;

import java.util.Scanner;

public class Continue_01 {
	public static void main(String[] args) {
		//5개의 정수를 받고 그 중 양수들만 합하여 출력
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		System.out.println("정수 5개를 입력하세요 >>");
		
		for(int i = 0; i<5; i++) {
			int n = scan.nextInt(); //정수 입력
			
			if(n <= 0) {
				continue;
			} else {
				sum += n;
			}
		}
		System.out.println("입력된 정수의 합계는 : ");
		System.out.println(sum);
		scan.close();
	}
}
>>>>>>> 4cadebe65fc06f8649df3cde03fe05c0c94be29d
