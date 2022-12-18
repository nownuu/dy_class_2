package test02;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartTVEX {
	public static void main(String[] args) {
		ArrayList<SmartTV> smlist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		//정보 받을 양 입력 받기
		System.out.println("몇 개의 정보를 입력하실 건가요?");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.println("TV 제조사 >> ");
			int tMake = sc.nextInt();
			System.out.println("TV 가격 >> ");
			int price = sc.nextInt();
			System.out.println("TV 크키 >> ");
			int tSize = sc.nextInt();
			
			System.out.println("운영체제 타입 >> ");
			int tType = sc.nextInt();
			System.out.println("인터넷 가능 여부 (true / false)");
			boolean internet = sc.nextBoolean();
			System.out.println("블루투스 가능 여부 (true / false)");
			boolean buletooth = sc.nextBoolean();

			// 객체 저장
			SmartTV sm = new SmartTV(tMake, price, tSize, tType, internet, buletooth);
			smlist.add(sm);
		}
		
		// 전체 출력
		System.out.println("전체 출력");
		for(int i = 0; i<num; i++) {
			SmartTV sm = smlist.get(i);
			System.out.println(sm);
			sm.internetPlay();
		}
		
		System.out.println("삼성 출력>>> ");
		for(int i = 0; i<num; i++) {
			SmartTV sm = smlist.get(i);
			if(sm.gettMake() == Define.samsung) {
				System.out.println(sm.gettMake());
			}
		}
		
		sc.close();
	}
}
