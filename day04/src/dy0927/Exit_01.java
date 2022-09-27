package dy0927;

import java.util.Scanner;

public class Exit_01 {
	public static void main(String[] args) {
		
		// exit가 입력되면 while문을 벗어나도록 break문을 활용
		
		Scanner scan = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다.");
		
		while(true) {
			System.out.println(">>");
			String text = scan.nextLine();
			
			if(text.equals("exit")) { //if(text == exit) 는 error
				break; //exit가 입력되면 break;
			}
		}
		System.out.println("종료합니다.");
		scan.close();
	}
}
