package test03;

import java.util.Scanner;

public class Test03_01 {
	public static void main(String[] args) {
		// ù ���� �ܾ� ã��
		
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next().toUpperCase();
		char b = sc.next().charAt(0);
		b = Character.toUpperCase(b);
		
		for(int i = 0; i<a.length(); i++) {
			if(a.charAt(i) == b) {
				ans ++;
			}
		}
		
		System.out.println(ans);
	}
}
