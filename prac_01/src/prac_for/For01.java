package prac_for;

import java.util.Arrays;

public class For01 {
	public static void main(String[] args) {
		int sum = 0;
		int num[] = {1, 2, 3, 4, 5};
		String fruit []= {"���", "�ٳ���", "����", "��", "�޷�", "����", "����"};
		double weight[] = {45.1, 50.6, 53.1, 55.4, 72,0, 77.3, 80.8};
		
		for (int k : num) {// �ݺ��� ������ k�� num[0], num[1] ~~~ ������ ����
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("\n�� : "+ sum);
		
		for (String  str : fruit) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		Arrays.sort(weight);
		
		double total = 0;
		for (double person : weight) {
			System.out.print(person + " ");
			total += person;
		}
		System.out.println("\n��� : "+(float)total/weight.length);
	}
}
