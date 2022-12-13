package collection01;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(100);
		a.add(200);
		a.add(300);
		
		for(int i = 0; i<a.size(); i++) {
			System.out.print(a.get(i)+"\t");
		}
		
		System.out.println();
		ArrayList<Double> b = new ArrayList<Double>();
		b.add(3.14);
		b.add(4.14);
		b.add(5.14);
		
		for(int i = 0; i<b.size(); i++) {
			System.out.print(b.get(i)+"\t");
		}
	}
}
