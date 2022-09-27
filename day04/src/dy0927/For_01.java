package dy0927;

/*
 * JAVA 반복문의 종류 ------- for 문
 * for (초기문; 조건식; 반복 후 작업){ 	작업문  }
 * for (int i = 0; i < 100; i++){  // i가 0부터 9까지 10번 반복
 * 			 System.out.print(i);	 //0에서 9까지 출력
 * 	 }
 * 
 * 변수 i는 for문을 벗어나서 사용이 불가능함.
 * 
 * **/
public class For_01 {
	public static void main(String[] args) {
		//0부터 10까지 for문을 이용해서 출력

		for(int i = 0; i<10; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n=====================\n");
		
		for(int i = 0; i<10; i++) {
			System.out.println(i); //ln이 들어가는 경우 출력할 때마다 enter됨
		}
		
		System.out.println("\n=====================\n");
		
		for(int i=10; i>=0; i--) {
			System.out.print(i+" ");
		}
	}
}
