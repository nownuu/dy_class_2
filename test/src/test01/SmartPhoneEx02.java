package test01;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartPhoneEx02 {	
	public static void main(String[] args) {
		
		// ���� ���� �Է� �޾Ƽ� ����ϴ� ���
		System.out.println("=== 20221021 �ڼ��� ===");
		ArrayList<SmartPhone> spList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� ������ �Է� �� ���ΰ���? >>");
		int cnt = sc.nextInt();
		
		for(int i=0; i<cnt; i++) {
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
			SmartPhone ps = new SmartPhone(pname, maker, price , ptype, memory);
			spList.add(ps);
		}
		
		// ��ü ���
		for(int i = 0; i<spList.size(); i++) {
			SmartPhone ps = spList.get(i);
			System.out.println(ps);
		}
		
		sc.close();
	}
}
