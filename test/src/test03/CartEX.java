package test03;

import java.util.ArrayList;
import java.util.Scanner;

public class CartEX {
	public static void main(String[] args) {
		ArrayList<Cart> ctList = new ArrayList<Cart>();
		Scanner sc = new Scanner(System.in);
		
		// 아이템 입력받기
		System.out.println("상품을 입력합니다.");
		while(true) {
			System.out.print("상품 번호 >> ");
			int no = sc.nextInt();
			System.out.print("상품명 >> ");
			String name = sc.next();
			System.out.print("상품가격 >> ");
			int price = sc.nextInt();
			System.out.print("상품종류 (전자 제품 : 100, 식료퓸 : 200, 도서 : 300 )>> ");
			int kind = sc.nextInt();
			System.out.print("상품 개수 >> ");
			int cnt = sc.nextInt();
			
			// 객체 저장
			Cart ct = new Cart(no, name, price, kind, cnt);
			ctList.add(ct);
			
			// 추가 입력 여부
			System.out.println("추가로 상품을 입력하시겠습니까? (Y || N)");
			String rep = sc.next();
			
			if(rep.equalsIgnoreCase("N")) break;
		}
		
		System.out.println("======================");
		// 입력 받은 목록 출력받기
		for(int i = 0; i<ctList.size(); i++) {
			Cart ct = ctList.get(i);
			System.out.println(ct);
		}
		
		System.out.println("찾으시는 상품의 종류를 입력하세요 (전자 제품 : 100, 식료퓸 : 200, 도서 : 300 )");
		int ans = sc.nextInt();
		
		for(int i = 0; i<ctList.size(); i++) {
			Cart ct = ctList.get(i);
			if(ct.getKind() == ans) {
				System.out.println(ct.getName() + " "+ct.getKind()+ " "+ct.getPrice());
			}
		}
		
		System.out.println("식료품을 구해봤어요.");
		for(int i = 0; i<ctList.size(); i++) {
			Cart ct = ctList.get(i);
			if(ct.getKind()==Define.groc) {
				System.out.println(ct.getName() + " "+ct.getKind()+ " "+ct.getPrice());
			}
		}
		
		System.out.println("입력된 총 개수 : "+ctList.size());
		
		int ctSum = 0;
		for(int i=0; i<ctList.size(); i++) {
			Cart ct = ctList.get(i);
			int sum = ct.getPrice() * ct.getCnt();
			ctSum += sum;
		}
		System.out.println("입력된 총 가격 : " +ctSum);
		sc.close();
	}
}
