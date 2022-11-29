package inheritance01;
/*
 * 객체 지향의 상속
 * 부모클래스에 만들어진 필드, 메소드를 자식 클래스가 물려 받음.
 * 동일한 특성을 재정의해 코드가 간결해짐(중복 제거)
 * 
 *  상속의 장점 : 클래스의 간결화, 클래스 관리 용이, 
 *  	소프트웨어의 생산성 향상(클래스 재사용과 확장 용이, 클래스의 작성 속도 빠름)
 *  
 *  부모 클래스 == 슈퍼 클래스 // 자식 클래스 == 서브 클래스
 *  extends 키워드 사용
 * */
public class Point {
	private int x;
	private int y;
	
	// 생성자
	public Point() {}
	public Point(int x, int y) {
		this.x  = x;
		this.y = y;
	}
	
	// 메소드
	public void set(int x, int y) {
		this.x  = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("("+x+", "+y+")");
	}
}
