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
		System.out.println("���� �׸��ϴ�.");
	}

	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		double area = 3.14 * radius * radius;
		System.out.println("���� ���� = "+area);
	}

	@Override
	public void getGili() {
		// TODO Auto-generated method stub
		double gili = 3.14 * 2 * radius;
		System.out.println("���� ���� = "+gili);
	}
}


public class MethodEx {
	public static void main(String[] args) {
//		�߻� Ŭ������ ���� �� ����		
//		Shape sh1 = new Shape();
		
		Rect rect = new Rect("�簢��", 2, 4);
		rect.draw();
		rect.printArea();
		rect.getGili();
		System.out.println();
		
		Circle circle = new Circle("��", 1);
		circle.draw();
		circle.printArea();
		circle.getGili();
		System.out.println();
		
		Rect tv = new Rect("TV", 65, 40);
		tv.draw();
		tv.printArea();
		tv.getGili();
		System.out.println();
		
		Circle pizza = new Circle("����", 10);
		pizza.draw();
		pizza.printArea();
		pizza.getGili();
		
		System.out.println("\n������� ������ �� >> "+Shape.count);
	}
}
