package prac_array01;

import java.util.Scanner;

public class Exception01 {
	public static void main(String[] args) {
		//예외처리 - 배열
		//ArrayIndexOutOfBoundsException
		Scanner sc = new Scanner(System.in);
		
		int aArray[] = new int[5];
		aArray[0] = 0;
		
		try {
			for(int i = 0; i<aArray.length; i++) {
				aArray[i+1] = i+1+aArray[i]; 
//				aArray[i] = i+1+aArray[i];  ------- 정상 코드
				System.out.println("aArray["+i+"] = "+aArray[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(); //오류값 확인 track()
			System.out.println("배열의 인덱스 아웃");
		}
	}
}
