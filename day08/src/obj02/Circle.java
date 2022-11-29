package obj02;

//설계도
public class Circle {
	// 1. 필드
	int radius;
	
	// 2. 생성자
	public  Circle() {} //기본 생성자
	public Circle(int radius) {
		this.radius = radius;
	}
	
	// 3. 메소드
	// 접근 지정자 + 리턴타입 + 메소드 이름 + 메소드 인자들(null 가능)
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	// 메소드 오버로딩
	// 이름이 같은 메소드 작성 ( 매개변수의 개수나 타입이 서로 다르고, 이름이 동일한 메소드)
	public int add(int i, int j) {
		return i + j;
	}
	public int add(int i, int j, int k) {
		return i + j+k;
	}
	public double add(double i, double j) {
		return i + j;
	}
}
