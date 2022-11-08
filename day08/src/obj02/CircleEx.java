package obj02;

public class CircleEx {
	public static void main(String[] args) {
		// 객체는 항상 생성자를 호출
		int arr[] = new int[10];
		Circle c[] = new Circle[100];
		
		for(int i = 0; i<c.length; i++) {
			//public Circle(int radius) 생성자 호출
			c[i] = new Circle(i+1);
		}
		
		//출력
		for(int i = 0; i<c.length; i++) {
			System.out.println((float)c[i].getArea());
		}
		System.out.println();
		
		// 메소드 오버로딩
		Circle c1 = new Circle();
		System.out.println(c1.add(1, 2));
		System.out.println(c1.add(1, 2, 3));
		System.out.println(c1.add(1.2, 2.3));
	}
}
