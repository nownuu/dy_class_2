package basic;

import java.util.Scanner;

public class Test2_1 {
	public static void main(String[] args) {
		//가로 width, 세로 height 을 빈칸으로 구분하여 입력하시오.
		// 가로 width, 세로 height, 직사각형 면적을 구하고 출력하시오.
		
		System.out.println("작사각형의 가로, 세로를 입력하시오");
		Scanner rect = new Scanner(System.in);
		
		int width = rect.nextInt();
		int height = rect.nextInt();
		System.out.println("가로 : "+width+"\n세로 : "+height);
		
		int rectArea = width * height;
		System.out.println("직사각형의 면적"+rectArea);
	}
}