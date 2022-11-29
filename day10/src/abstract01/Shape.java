package abstract01;
/*추상 메소드 (abstract method)
 * 
 * 선언되어 있으나 구현되어 있지 않은 메소드 abstract로 선언
 * abstract public String getName();
 * public abstract String getName();
 * 
 * -> 서브 클래스에서 오버라이딩하여 구현해야 함.
 * */


public abstract class Shape { //추상 클래스 선언
	private String name;
	static int count;
	
	public Shape() {
		count++;
	}
	
	public Shape(String name) {
		this.name = name;
		count++;
	}

	public  abstract void draw();
	public abstract  void printArea();
	public abstract  void getGili();
}

//=====================================
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
		System.out.println("사각형을 그립니다.");
	}

	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		int area = width * height;
		System.out.println("사각형 면적 = "+area);
	}

	@Override
	public void getGili() {
		// TODO Auto-generated method stub
		int gili = (width+height)*2;
		System.out.println("사각형의 길이 = "+gili);
	}
}

//=====================================
