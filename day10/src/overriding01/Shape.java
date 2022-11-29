package overriding01;

/*�޼ҵ� �������̵�(Method Overriding)
 * 
 * ���� Ŭ������ �޼ҵ带 ���� Ŭ�������� ������
 *  ���� Ŭ���� �޼ҵ��� �̸�, �Ű����� Ÿ�� �� ����, ���� Ÿ�� �� ��� �� �����ϰ� �ۼ�
 *  
 *  �������̵� = ���� Ŭ������ ����� �޼ҵ带 �� ���� Ŭ�������� �ڽŸ��� �������� ���� �����ϴ� ��� 
 *  ��, ���� �ð� ������ ����
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
		System.out.println("���� (Shape) ======");
	}
	
	public  void printArea() {
		// TODO Auto-generated method stub
		System.out.println("���� ���� ���ϱ�");
	}
	public  void getGili() {
		// TODO Auto-generated method stub
		System.out.println("���� �ѷ� ���� ���ϱ�");
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
		System.out.println("�� (Circle)");
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
		System.out.println("�簢�� (Rect)");
	}

	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		int area = width *  height;
		System.out.println("�簢���� ���� = "+area);
	}
	
	@Override
	public void getGili() {
		// TODO Auto-generated method stub
		double gili = (width+height)*2;
		System.out.println("�簢���� ���� = "+gili);
	}
}


