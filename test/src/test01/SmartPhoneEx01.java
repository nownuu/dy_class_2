package test01;

import java.util.ArrayList;

public class SmartPhoneEx01 {
	public static void main(String[] args) {
		
		System.out.println("=== 20221021 �ڼ���  === ");
		ArrayList<SmartPhone> smList = new ArrayList<>();

		SmartPhone sp1 = new SmartPhone("������ s20", 100, 300000, 1, 256);
		SmartPhone sp2 = new SmartPhone("�����̷����", 300, 260000, 1, 128);
		SmartPhone sp3 = new SmartPhone("������ s22", 100, 700000, 1, 256);
		SmartPhone sp4 = new SmartPhone("������ s21+", 100, 5500000, 1, 256);
		SmartPhone sp5 = new SmartPhone("������ 14", 200, 1600000, 2, 128);
		SmartPhone sp6 = new SmartPhone("������ 13", 200, 1000000, 2, 128);
		
		smList.add(sp1);
		smList.add(sp2);
		smList.add(sp3);
		smList.add(sp4);
		smList.add(sp5);
		smList.add(sp6);

		System.out.println("������� ��ü�� �� >> "+smList.size()+"\n");
		
		// �������� ��ǰ�� ����ϼ���.
		System.out.println("\n�Ｚ���� ��ǰ ==================");
		for(int i=0; i<smList.size(); i++) {
			SmartPhone sp = smList.get(i);
			if(sp.getMaker() == Define.samsung) {
				System.out.println(sp.getPname()+", "+sp.getMaker());
			}
		}
		

		// ���� ��ǰ�� ����ϼ���.
		System.out.println("\nAPPLE ��ǰ ==================");
		for(int i=0; i<smList.size(); i++) {
			SmartPhone sp = smList.get(i);
			if(sp.getMaker() == Define.apple) {
				System.out.println(sp.getPname()+", "+sp.getMaker());
			}
		}

		// ������ 100���� �̻��� ��ǰ�� ��ǰ��� ������ ����ϼ���.
		System.out.println("\n������ 100���� �̻��� ��ǰ ==================");
		for(int i=0; i<smList.size(); i++) {
			SmartPhone sp = smList.get(i);
			if(sp.getPrice()>=1000000) {
				System.out.println(sp.getPname()+", "+sp.getMaker() + ", "+sp.getPrice());
			}
		}
	}
}
