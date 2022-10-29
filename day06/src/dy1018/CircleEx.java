package dy1018;

/*객체 지향 java - class 생성 + 객체 생성*/
/*Circle의 실행 파일*/
public class CircleEx {
	public static void main(String[] args) {
		Circle pizza;
		
		pizza = new Circle();
		pizza.name = "불고기 피자";
		pizza.radius = 10;
		double area = pizza.getArea();
		
		System.out.println(pizza.name+"의 area = "+area);
		
		/*===========================================*/
		
		Circle pizza2 = new Circle();
		pizza2.name = "하와이안 피자";
		pizza2.radius = 20;
		double area_2 = pizza2.getArea();
		
		System.out.println(pizza2.name+"의 area = "+area_2);
		
		/*===========================================*/
		
		Circle gong = new Circle();
		gong.name = "축구공";
		gong.radius = 4;
		double area_g = gong.getArea();
		
		System.out.println(gong.name+"의 area = "+area_g);
	}
}
