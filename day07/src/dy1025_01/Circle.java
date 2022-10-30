package dy1025_01;

/*
 * 클래스 : 객체를 만들어내기 위한 설계도 혹은 틀
 *  -  객체의 속성(변수)과 행동(메소드) 포함
 *  
 *  객체 생성 : 반드시 new 키워드를 이용하여 생성
 *  
 *  생성자 = 메소드
 *  생성자 이름은 클래스 이름과 반드시 동일, 오버로딩 가능
 *  생성자는 new를 통해 객체를 생성할 때 객체당 한 번 호출 + 리턴 타입 지정 불가
 * */

//클래스 설계도
public class Circle { //클래스 작성 - 필드 - 생성자
	int radius;
	String name;
	
	public Circle() {}
	
	public Circle(int r, String n) {
		//필드값 초기화
		radius = r;
		name = n;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
}
