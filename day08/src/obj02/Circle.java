package obj02;

//���赵
public class Circle {
	// 1. �ʵ�
	int radius;
	
	// 2. ������
	public  Circle() {} //�⺻ ������
	public Circle(int radius) {
		this.radius = radius;
	}
	
	// 3. �޼ҵ�
	// ���� ������ + ����Ÿ�� + �޼ҵ� �̸� + �޼ҵ� ���ڵ�(null ����)
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	// �޼ҵ� �����ε�
	// �̸��� ���� �޼ҵ� �ۼ� ( �Ű������� ������ Ÿ���� ���� �ٸ���, �̸��� ������ �޼ҵ�)
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
