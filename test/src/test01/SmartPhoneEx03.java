package test01;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartPhoneEx03 {	
	public static void main(String[] args) {
		
		// ���� ���� �Է� �޾Ƽ� ����ϴ� ���
		System.out.println("=== 20221021 �ڼ��� ===");
		ArrayList<SmartPhone> spList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("�ڵ����� ���� �Է�>>");
			String pname = sc.next();
			System.out.println("����Ŀ >> ");
			int maker = sc.nextInt();
			System.out.println("���� >> ");
			int price = sc.nextInt();
			System.out.println("�ü�� >> ");
			int ptype = sc.nextInt();
			System.out.println("�޸� >>");
			int memory = sc.nextInt();

			// ��ü�� ����
			SmartPhone sp = new SmartPhone(pname, maker, price , ptype, memory);
			spList.add(sp);
			
			System.out.println("��� �Է��Ͻðڽ��ϱ�? [Y | N]");
			String rty = sc.next();
			
			if(rty.equalsIgnoreCase("N")) {
				break;
			}
		}
		
		// ��ü ���
		for(int i = 0; i<spList.size(); i++) {
			SmartPhone ps = spList.get(i);
			System.out.println(ps);
		}
		
		// �Ｚ ��ǰ�� ���
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
