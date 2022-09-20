package basic;
/***
 * 클래스 만들기 (대문자)
 *  변수 선언 - 변수 타입과 변수 이름 선언 / 메소드 내에서 선언된 변수는 지역 변수
 *  문장 =  ;로 한문장의 끝을 인식
 *  화면 출력 - 표준 출력 스트립에 메시지 출력
 *  
 *  예약어 = 색이 있는 글씨
 */
public class Hello {
	public static void main(String[] args) {
		/* 
		 * 표준 출력 스트림인 system.out의 println() 메소드 호출
		 *  println()은 여러 타입의 데이터 출력 가능 / 출력 후 다음 행으로 커서 이동
		 *  system.out = 모니터(출력 장치)
		 *  system.in = 키보드(입력 장치)
		 */
		
		int i = 20; //데이터 타입 
		int s;
		char a;
		
		s = i + 10;
		a = '?';
		
		System.out.println(s);
		System.out.println("Hello");
		System.out.println(a);
	}
}
