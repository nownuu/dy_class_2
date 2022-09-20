package basic;

/*
 * 식별자란 = 클래스, 변수, 상수 메소드 등에 붙이는 이름
 * 
 * 식별자의 원칙 = 특수 문자, 공백 또는 탭은 식별자로 사용할 수 없으나 >>  _, $ << 는 사용 가능 (첫 번째 문자로 사용 가능하나 잘 안함)
 * 유니코드 문자 사용 가능, 한글 사용 가능
 * 자바 언어의 키워드는 식별자로 사용 불가
 * 식별자의 첫 번째 문자로 숫자는 사용 불가
 * 길이 제한 없음
 * true false와 null은 식별자로 사용 불가
 * 대소문자 구별
 * **/

/*
 * 자바 언어의 이름 붙이는 관습 : 헝가리언 이름 붙이기
 * 클래스 이름 -  첫 번째 문자는 대문자로 시작, 각 단어의 첫 번째 문자만 대문자
 * 변수, 메소드 이름 - 첫 단어 이후 각 단어의 첫 번째 문자는 대문자로 시작
 * 상수 이름 - 모든 문자를 대문자로 표시
 **/

/*
 * 자바의 데이터 타입
 * --- 기본 타입 : 8개 (boolean(논리), [char, byte(문자)], [short, int, long(정수)], [float,double(실수)])
 * --- 레퍼런스 타입(실제 데이터를 가지지 않고 참조) : 1개이며 용도는 다음 3가지 (배열, 클래스 인터페이스)
 * 
 * 자바의 기본 타입의 크기가 정해저 있음 = CPU나 운영체제에 따라 변하지 않음
 */

/*
 * 변수(Variable) = 프로그램 실행 중에 값을 임시 저장하기 위한 공간 / 변수 값은 프로그램 수행 중 변경될 수 있음
 * 상수(Const) = final 키워드 사용 / 선언 시 초기값 지정 / 실행 중 값 변경 불가
 *  **/
public class Identifier {
	public static void main(String[] args) {
		final double PI = 3.14;
		
		double radius = 10.0; //변수 선언 초기화
		double circleArea = radius * radius * PI; //반지름 * 반지름 * PI
		
		System.out.println("원의 면적 : " + circleArea);
		System.out.println("-------------------------");
		
		//가로, 세로 직사각형의 면적 구하기
		int width = 10;
		int height = 12;
		
		int rectArea = width * height; //가로 * 세로
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("직사각형의 면적 : " + rectArea);
	}
}
