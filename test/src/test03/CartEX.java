package test03;

import java.util.ArrayList;
import java.util.Scanner;

public class CartEX {
	public static void main(String[] args) {
		ArrayList<Cart> ctList = new ArrayList<Cart>();
		Scanner sc = new Scanner(System.in);
		
		// ������ �Է¹ޱ�
		System.out.println("��ǰ�� �Է��մϴ�.");
		while(true) {
			System.out.print("��ǰ ��ȣ >> ");
			int no = sc.nextInt();
			System.out.print("��ǰ�� >> ");
			String name = sc.next();
			System.out.print("��ǰ���� >> ");
			int price = sc.nextInt();
			System.out.print("��ǰ���� (���� ��ǰ : 100, �ķ�Ǿ : 200, ���� : 300 )>> ");
			int kind = sc.nextInt();
			System.out.print("��ǰ ���� >> ");
			int cnt = sc.nextInt();
			
			// ��ü ����
			Cart ct = new Cart(no, name, price, kind, cnt);
			ctList.add(ct);
			
			// �߰� �Է� ����
			System.out.println("�߰��� ��ǰ�� �Է��Ͻðڽ��ϱ�? (Y || N)");
			String rep = sc.next();
			
			if(rep.equalsIgnoreCase("N")) break;
		}
		
		System.out.println("======================");
		// �Է� ���� ��� ��¹ޱ�
		for(int i = 0; i<ctList.size(); i++) {
			Cart ct = ctList.get(i);
			System.out.println(ct);
		}
		
		System.out.println("ã���ô� ��ǰ�� ������ �Է��ϼ��� (���� ��ǰ : 100, �ķ�Ǿ : 200, ���� : 300 )");
		int ans = sc.nextInt();
		
		for(int i = 0; i<ctList.size(); i++) {
			Cart ct = ctList.get(i);
			if(ct.getKind() == ans) {
				System.out.println(ct.getName() + " "+ct.getKind()+ " "+ct.getPrice());
			}
		}
		
		System.out.println("�ķ�ǰ�� ���غþ��.");
		for(int i = 0; i<ctList.size(); i++) {
			Cart ct = ctList.get(i);
			if(ct.getKind()==Define.groc) {
				System.out.println(ct.getName() + " "+ct.getKind()+ " "+ct.getPrice());
			}
		}
		
		System.out.println("�Էµ� �� ���� : "+ctList.size());
		
		int ctSum = 0;
		for(int i=0; i<ctList.size(); i++) {
			Cart ct = ctList.get(i);
			int sum = ct.getPrice() * ct.getCnt();
			ctSum += sum;
		}
		System.out.println("�Էµ� �� ���� : " +ctSum);
		sc.close();
	}
}
