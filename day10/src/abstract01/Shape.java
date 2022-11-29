package abstract01;
/*�߻� �޼ҵ� (abstract method)
 * 
 * ����Ǿ� ������ �����Ǿ� ���� ���� �޼ҵ� abstract�� ����
 * abstract public String getName();
 * public abstract String getName();
 * 
 * -> ���� Ŭ�������� �������̵��Ͽ� �����ؾ� ��.
 * */


public abstract class Shape { //�߻� Ŭ���� ����
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
		System.out.println("�簢���� �׸��ϴ�.");
	}

	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		int area = width * height;
		System.out.println("�簢�� ���� = "+area);
	}

	@Override
	public void getGili() {
		// TODO Auto-generated method stub
		int gili = (width+height)*2;
		System.out.println("�簢���� ���� = "+gili);
	}
}

//=====================================
