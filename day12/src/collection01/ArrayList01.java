package collection01;

import java.util.ArrayList;
import java.util.Scanner;

// 컬렉션은 제네릭 기법으로 구현
// 컬렉션의 요소는 객체만 가능.
// add &  get
public class ArrayList01 {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요 >> ");
			String s = sc.next();
			a1.add(s);
		}
		
		// 출력
		for(int i = 0; i<a1.size(); i++) {
			String name = a1.get(i);
			System.out.println(name + "  ");
		}
		
		// 가장 긴 이름 출력
		int maxIndex = 0;
		for(int i=0; i<a1.size(); i++) {
			if(a1.get(i).length() > a1.get(maxIndex).length()) {
				maxIndex = i;
			}
		}
		System.out.println("가장 긴 이름은 >> ");
		System.out.println(a1.get(maxIndex));
		
		sc.close();
	}
}
