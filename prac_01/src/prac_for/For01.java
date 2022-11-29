package prac_for;

import java.util.Arrays;

public class For01 {
	public static void main(String[] args) {
		int sum = 0;
		int num[] = {1, 2, 3, 4, 5};
		String fruit []= {"사과", "바나나", "망고", "배", "메론", "딸기", "포도"};
		double weight[] = {45.1, 50.6, 53.1, 55.4, 72,0, 77.3, 80.8};
		
		for (int k : num) {// 반복될 때마다 k는 num[0], num[1] ~~~ 값으로 설정
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("\n합 : "+ sum);
		
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
		System.out.println("\n평균 : "+(float)total/weight.length);
	}
}
