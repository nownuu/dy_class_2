package test04;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartPhoneEX {
	public static void main(String[] args) {
		ArrayList<SmartPhone> smL = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�Է�>>");
			System.out.println("�ڵ����� ���� �Է�>>");
			String pName = sc.next();
			System.out.println("����Ŀ >> ");
			int maker = sc.nextInt();
			System.out.println("���� >> ");
			int price = sc.nextInt();
			System.out.println("�ü�� >> ");
			int ptype = sc.nextInt();
			System.out.println("�޸� >>");
			int memory = sc.nextInt();
			
			SmartPhone sm = new SmartPhone(pName, maker, price, ptype, memory);
			smL.add(sm);
			
			System.out.println("��� �Է��Ͻðڽ��ϱ�? [Y | N]");
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
