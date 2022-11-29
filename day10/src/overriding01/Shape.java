package overriding01;

/*메소드 오버라이딩(Method Overriding)
 * 
 * 슈퍼 클래스의 메소드를 서브 클래스에서 재정의
 *  슈퍼 클래스 메소드의 이름, 매개변수 타입 및 개수, 리턴 타입 등 모든 것 동일하게 작성
 *  
 *  오버라이딩 = 슈퍼 클래스에 선언된 메소드를 각 서브 클래스들이 자신만의 내용으로 새로 구현하는 기능 
 *  즉, 실행 시간 다형성 실현
 * */
class Shape {
	
	private String name;
	static int count;
	
	public Shape() {
		count++;
	}
	
	public Shape(String name) {
		this.name = name;
		count++;
	}

	public  void draw() {
		// TODO Auto-generated method stub
		System.out.println("도형 (Shape) ======");
	}
	
	public  void printArea() {
		// TODO Auto-generated method stub
		System.out.println("도형 면적 구하기");
	}
	public  void getGili() {
		// TODO Auto-generated method stub
		System.out.println("도형 둘레 길이 구하기");
	}	
}
//=================================================
class Circle extends Shape{
	private int radius;

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}
	
	public Circle() {}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("원 (Circle)");
	}
	
	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		double area = 3.14 * radius * radius;
		System.out.println("원의 면적 = "+area);
	}
	
	@Override
	public void getGili() {
		// TODO Auto-generated method stub
		double gili = 3.14 * 2 * radius;
		System.out.println("원의 길이 = "+gili);
	}
}
//=================================================
class Rect extends Shape{
	private int width;
	private int height;
	
	public Rect() {}

	public Rect(String name,int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("사각형 (Rect)");
	}

	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		int area = width *  height;
		System.out.println("사각형의 면적 = "+area);
	}
	
	@Override
	public void getGili() {
		// TODO Auto-generated method stub
		double gili = (width+height)*2;
		System.out.println("사각형의 길이 = "+gili);
	}
}


