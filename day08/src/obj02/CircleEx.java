package obj02;

public class CircleEx {
	public static void main(String[] args) {
		// ��ü�� �׻� �����ڸ� ȣ��
		int arr[] = new int[10];
		Circle c[] = new Circle[100];
		
		for(int i = 0; i<c.length; i++) {
			//public Circle(int radius) ������ ȣ��
			c[i] = new Circle(i+1);
		}
		
		//���
		for(int i = 0; i<c.length; i++) {
			System.out.println((float)c[i].getArea());
		}
		System.out.println();
		
		// �޼ҵ� �����ε�
		Circle c1 = new Circle();
		System.out.println(c1.add(1, 2));
		System.out.println(c1.add(1, 2, 3));
		System.out.println(c1.add(1.2, 2.3));
	}
}
