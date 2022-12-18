package test01;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartPhoneEx02 {	
	public static void main(String[] args) {
		
		// 정보 수를 입력 받아서 출력하는 방법
		System.out.println("=== 20221021 박소현 ===");
		ArrayList<SmartPhone> spList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 개의 정보를 입력 할 것인가요? >>");
		int cnt = sc.nextInt();
		
		for(int i=0; i<cnt; i++) {
			System.out.println("핸드폰의 종류 입력>>");
			String pname = sc.next();
			System.out.println("메이커 >> ");
			int maker = sc.nextInt();
			System.out.println("가격 >> ");
			int price = sc.nextInt();
			System.out.println("운영체제 >> ");
			int ptype = sc.nextInt();
			System.out.println("메모리 >>");
			int memory = sc.nextInt();
			
			// 객체에 저장
			SmartPhone ps = new SmartPhone(pname, maker, price , ptype, memory);
			spList.add(ps);
		}
		
		// 전체 출력
		for(int i = 0; i<spList.size(); i++) {
			SmartPhone ps = spList.get(i);
			System.out.println(ps);
		}
		
		sc.close();
	}
}
