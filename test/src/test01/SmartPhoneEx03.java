package test01;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartPhoneEx03 {	
	public static void main(String[] args) {
		
		// 정보 수를 입력 받아서 출력하는 방법
		System.out.println("=== 20221021 박소현 ===");
		ArrayList<SmartPhone> spList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true){
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
			SmartPhone sp = new SmartPhone(pname, maker, price , ptype, memory);
			spList.add(sp);
			
			System.out.println("계속 입력하시겠습니까? [Y | N]");
			String rty = sc.next();
			
			if(rty.equalsIgnoreCase("N")) {
				break;
			}
		}
		
		// 전체 출력
		for(int i = 0; i<spList.size(); i++) {
			SmartPhone ps = spList.get(i);
			System.out.println(ps);
		}
		
		// 삼성 제품만 출력
		System.out.println(">> 3STAR <<");
		for(int i = 0; i<spList.size(); i++) {
			SmartPhone sp = spList.get(i);
			if(sp.getMaker() == Define.samsung) {
				System.out.println(sp.getPname());
			}
		}
		
		sc.close();
	}
}
