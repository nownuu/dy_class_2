package wapper01;

import java.util.Random;

public class MathEx {
	public static void main(String[] args) {
		
		double a = 3.14;
		System.out.println(Math.PI);
		System.out.println(Math.ceil(a));
		System.out.println(Math.floor(a));
		System.out.println(Math.sqrt(a));
		System.out.println(Math.exp(a));
		System.out.println(Math.round(a));
		
		//1부터 45사이의 난수 구하기
		for(int i = 0; i<5; i++) {
			int n = (int)(Math.random()*45 + 1);
			System.out.println(n);
		}
	}
}
