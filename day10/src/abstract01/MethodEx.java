package abstract01;

class Circle  extends Shape{
	
	private int radius;
	
	public Circle() {}
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그립니다.");
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


public class MethodEx {
	public static void main(String[] args) {
//		추상 클래스라 만들 수 없음		
//		Shape sh1 = new Shape();
		
		Rect rect = new Rect("사각형", 2, 4);
		rect.draw();
		rect.printArea();
		rect.getGili();
		System.out.println();
		
		Circle circle = new Circle("원", 1);
		circle.draw();
		circle.printArea();
		circle.getGili();
		System.out.println();
		
		Rect tv = new Rect("TV", 65, 40);
		tv.draw();
		tv.printArea();
		tv.getGili();
		System.out.println();
		
		Circle pizza = new Circle("피자", 10);
		pizza.draw();
		pizza.printArea();
		pizza.getGili();
		
		System.out.println("\n만들어진 도형의 수 >> "+Shape.count);
	}
}
