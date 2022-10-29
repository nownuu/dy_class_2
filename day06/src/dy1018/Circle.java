package dy1018;

/*객체 지향 java - class 생성 + 객체 생성*/
public class Circle {
	// 1. 변수 속성(field)
	int radius;
	String name;
	
	// 2. 생성자
	public Circle() {}
	
	// 3. 메소드(동사, 기능 , 행동)
	public double getArea() {
		return 3.14 * radius * radius;
	}
}
