package prac_array01;

import java.util.Scanner;

public class Exception01 {
	public static void main(String[] args) {
		//����ó�� - �迭
		//ArrayIndexOutOfBoundsException
		Scanner sc = new Scanner(System.in);
		
		int aArray[] = new int[5];
		aArray[0] = 0;
		
		try {
			for(int i = 0; i<aArray.length; i++) {
				aArray[i+1] = i+1+aArray[i]; 
//				aArray[i] = i+1+aArray[i];  ------- ���� �ڵ�
				System.out.println("aArray["+i+"] = "+aArray[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(); //������ Ȯ�� track()
			System.out.println("�迭�� �ε��� �ƿ�");
		}
	}
}
