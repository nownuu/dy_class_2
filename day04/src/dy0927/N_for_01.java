package dy0927;
/*
 * 중첩 반복 : 반복문이 다른 반복문을 내포함
 * 이론적으로 몇 번이고 중첩 반복 가능
 * 너무 많은 중첩 반복은 프로그램 구조를 복잡하게 하므로 2중 또는 3중 반복이 적당
 * **/
public class N_for_01 {
	public static void main(String[] args) {
		// 구구단
		for(int i = 1; i<10; i++) {
			for(int j= 2; j<17; j++) { //단
				System.out.print(j + " * "+ i +" = "+ i*j);
				System.out.print(" \t");
			}
			System.out.println();
		}
	}
}
