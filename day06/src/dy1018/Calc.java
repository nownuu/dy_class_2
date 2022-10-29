package dy1018;

/*
 * main() 메소드  = 자바 응용 프로그램의 실행 시작 메소드
 *다른 클래스에서 메소드 접근 허용 - 객체 생성 전부터 호출 기능 - 리턴값 없음 - (문자열 배열[] - 매개 변수)
 * → run Configurations 에서 args 배열 설정
 * */
public class Calc {
	public static void main(String[] args) {
		double sum  = 0;
		
		for(int i = 0; i<args.length; i++) {
			//main에서 double[] 해도 됨
			sum += Double.parseDouble(args[i]);
		}
		
		System.out.println("합계 = "+sum);
	}
}
