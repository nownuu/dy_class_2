<<<<<<< HEAD
package dy0927;

public class For_02 {
	public static void main(String[] args) {
		//for문을 이용해서 1부터 10까지 출력하기 (예제 3-1)
		
		int sum = 0;
		for(int i = 0; i<10; i++) {
			sum += i;
			System.out.print(i); //더하는 수 출력
			
			if(i<9) {
				System.out.print(" + ");
			} else {
				System.out.print(" = "+sum);
			}
		}
	}
}
=======
package dy0927;

public class For_02 {
	public static void main(String[] args) {
		//for문을 이용해서 1부터 10까지 출력하기 (예제 3-1)
		
		int sum = 0;
		for(int i = 0; i<10; i++) {
			sum += i;
			System.out.print(i); //더하는 수 출력
			
			if(i<9) {
				System.out.print(" + ");
			} else {
				System.out.print(" = "+sum);
			}
		}
	}
}
>>>>>>> 4cadebe65fc06f8649df3cde03fe05c0c94be29d
