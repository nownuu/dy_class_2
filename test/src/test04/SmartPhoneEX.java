package test04;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartPhoneEX {
	public static void main(String[] args) {
		ArrayList<SmartPhone> smL = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("입력>>");
			System.out.println("핸드폰의 종류 입력>>");
			String pName = sc.next();
			System.out.println("메이커 >> ");
			int maker = sc.nextInt();
			System.out.println("가격 >> ");
			int price = sc.nextInt();
			System.out.println("운영체제 >> ");
			int ptype = sc.nextInt();
			System.out.println("메모리 >>");
			int memory = sc.nextInt();
			
			SmartPhone sm = new SmartPhone(pName, maker, price, ptype, memory);
			smL.add(sm);
			
			System.out.println("계속 입력하시겠습니까? [Y | N]");
			String rty = sc.next();
			
			if(rty.equalsIgnoreCase("N")) {
				break;
			}
		}
		
		for(int i =0; i<smL.size(); i++) {
			SmartPhone sm = smL.get(i);
			System.out.println(sm);
		}
		
		System.out.println(Phone.count);
	}
}
