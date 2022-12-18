package test02;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartTVEX {
	public static void main(String[] args) {
		ArrayList<SmartTV> smlist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		//���� ���� �� �Է� �ޱ�
		System.out.println("�� ���� ������ �Է��Ͻ� �ǰ���?");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.println("TV ������ >> ");
			int tMake = sc.nextInt();
			System.out.println("TV ���� >> ");
			int price = sc.nextInt();
			System.out.println("TV ũŰ >> ");
			int tSize = sc.nextInt();
			
			System.out.println("�ü�� Ÿ�� >> ");
			int tType = sc.nextInt();
			System.out.println("���ͳ� ���� ���� (true / false)");
			boolean internet = sc.nextBoolean();
			System.out.println("������� ���� ���� (true / false)");
			boolean buletooth = sc.nextBoolean();

			// ��ü ����
			SmartTV sm = new SmartTV(tMake, price, tSize, tType, internet, buletooth);
			smlist.add(sm);
		}
		
		// ��ü ���
		System.out.println("��ü ���");
		for(int i = 0; i<num; i++) {
			SmartTV sm = smlist.get(i);
			System.out.println(sm);
			sm.internetPlay();
		}
		
		System.out.println("�Ｚ ���>>> ");
		for(int i = 0; i<num; i++) {
			SmartTV sm = smlist.get(i);
			if(sm.gettMake() == Define.samsung) {
				System.out.println(sm.gettMake());
			}
		}
		
		sc.close();
	}
}
