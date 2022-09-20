package dy0920;

import java.util.Scanner;

public class Test2_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("달을 입력하세요.");
		//월 입력 받기
		int month = sc.nextInt();
		String season;
		if(month >= 3 && month <= 5) {
			season = "봄";
		} else if(month >= 6 && month <=8) {
			season = "여름";
		} else if(month >= 9 && month <=11) {
			season = "가을";
		} else if(month >12 ||  month == 0 ) {
			season = "입력 오류";
		} else {
			season = "겨울";
		}
		System.out.println("============== IF 문 ==============");
		System.out.println(month+"월의 계절은 "+season+"입니다.");
		
		// switch문
		switch(month / 1) {
		case 12:
		case 2:
		case 1:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		default:
			season="입력오류";
		}
		System.out.println("=========== SWITCH 문 ===========");
		System.out.println(month+"월의 계절은 "+season+"입니다.");
	}
}
