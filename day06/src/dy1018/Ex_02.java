package dy1018;

import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] args) {
		// try catch 블록을 이용하여 정수를 0으로 나누는 경우 0으로 나눌수 없습니다를 출력하고 다시 입력
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("나뉨수를 입력하세요 >> ");
			int  diviNum = sc.nextInt();
			System.out.println("나눔수를 입력하세요 >> ");
			int divisNum = sc.nextInt();
			
			try {
				int diviN = diviNum/divisNum;
				
				System.out.println(diviNum+"/"+divisNum+" = "+diviN); break;
			} catch (Exception e) { // 예외
				e.printStackTrace();
				System.out.println("0으로는 나눌 수 없습니다. retry..\n");
			}
		}
	}
}
