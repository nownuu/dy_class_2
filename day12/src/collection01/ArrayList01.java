package collection01;

import java.util.ArrayList;
import java.util.Scanner;

// �÷����� ���׸� ������� ����
// �÷����� ��Ҵ� ��ü�� ����.
// add &  get
public class ArrayList01 {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.print("�̸��� �Է��ϼ��� >> ");
			String s = sc.next();
			a1.add(s);
		}
		
		// ���
		for(int i = 0; i<a1.size(); i++) {
			String name = a1.get(i);
			System.out.println(name + "  ");
		}
		
		// ���� �� �̸� ���
		int maxIndex = 0;
		for(int i=0; i<a1.size(); i++) {
			if(a1.get(i).length() > a1.get(maxIndex).length()) {
				maxIndex = i;
			}
		}
		System.out.println("���� �� �̸��� >> ");
		System.out.println(a1.get(maxIndex));
		
		sc.close();
	}
}
