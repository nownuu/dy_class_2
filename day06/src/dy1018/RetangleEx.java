package dy1018;

import java.util.Scanner;

public class RetangleEx {
	public static void main(String[] args) {
		Retangle rect = new Retangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("입력>>");
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		
		System.out.println("사각형의 면적 = "+rect.getArea());
	}
}
