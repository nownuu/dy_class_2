package overriding01;

public class MethodEx {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		shape.printArea();
		shape.getGili();
		System.out.println();
		
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
		
		
		System.out.println("\n������� ������ �� >> "+shape.count);
	}
}
