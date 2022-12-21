package test05;

import java.util.ArrayList;
import java.util.Scanner;

public class CartEX {
	public static void main(String[] args) {
		ArrayList<Cart> ctList = new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("name >>");
			String name = sc.next();
			System.out.println("price");
			int price = sc.nextInt();
			System.out.println("maker");
			int maker = sc.nextInt();
			
			System.out.println("cnt");
			int cnt = sc.nextInt();
			System.out.println("os");
			int os = sc.nextInt();
			
			System.out.println("계속 진행? n");
			String going = sc.next();
			
			if(going.equalsIgnoreCase("N")) break;
			
			// 저장
			Cart ct = new Cart(name, price, maker, cnt, os);
			ctList.add(ct);
		}
		
		for(int i = 0; i<ctList.size(); i++) {
			Cart ct = ctList.get(i);
			
			// 출력
			System.out.println(ct);
		}
	
		
		for(int i = 0; i<ctList.size(); i++) {
			Cart ct = ctList.get(i);
			if(ct.getMaker() == Define.ennuu) {
				System.out.println(ct.getMaker() + " " + ct.getName());
			}
		}
	}
}
