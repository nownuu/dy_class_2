package test01;

import java.util.ArrayList;

public class SmartPhoneEx01 {
	public static void main(String[] args) {
		
		System.out.println("=== 20221021 박소현  === ");
		ArrayList<SmartPhone> smList = new ArrayList<>();

		SmartPhone sp1 = new SmartPhone("갤럭시 s20", 100, 300000, 1, 256);
		SmartPhone sp2 = new SmartPhone("샤오미레드미", 300, 260000, 1, 128);
		SmartPhone sp3 = new SmartPhone("갤럭시 s22", 100, 700000, 1, 256);
		SmartPhone sp4 = new SmartPhone("갤럭시 s21+", 100, 5500000, 1, 256);
		SmartPhone sp5 = new SmartPhone("아이폰 14", 200, 1600000, 2, 128);
		SmartPhone sp6 = new SmartPhone("아이폰 13", 200, 1000000, 2, 128);
		
		smList.add(sp1);
		smList.add(sp2);
		smList.add(sp3);
		smList.add(sp4);
		smList.add(sp5);
		smList.add(sp6);

		System.out.println("만들어진 객체의 수 >> "+smList.size()+"\n");
		
		// 섬성전자 제품만 출력하세요.
		System.out.println("\n삼성전자 제품 ==================");
		for(int i=0; i<smList.size(); i++) {
			SmartPhone sp = smList.get(i);
			if(sp.getMaker() == Define.samsung) {
				System.out.println(sp.getPname()+", "+sp.getMaker());
			}
		}
		

		// 애플 제품만 출력하세요.
		System.out.println("\nAPPLE 제품 ==================");
		for(int i=0; i<smList.size(); i++) {
			SmartPhone sp = smList.get(i);
			if(sp.getMaker() == Define.apple) {
				System.out.println(sp.getPname()+", "+sp.getMaker());
			}
		}

		// 가격이 100만원 이상인 제품의 제품명과 가격을 출력하세요.
		System.out.println("\n가격이 100만원 이상인 제품 ==================");
		for(int i=0; i<smList.size(); i++) {
			SmartPhone sp = smList.get(i);
			if(sp.getPrice()>=1000000) {
				System.out.println(sp.getPname()+", "+sp.getMaker() + ", "+sp.getPrice());
			}
		}
	}
}
