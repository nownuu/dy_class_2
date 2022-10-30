package dy1025_01;

public class CircleEx {
	public static void main(String[] args) {
		Circle pizza = new Circle(10, "불고기 피자");
		double pArea = pizza.getArea();
		
		System.out.println(pizza.name+"의 면적 >> "+pArea);
		//===================================================
		Circle donut = new Circle();
		donut.name = "글레이즈 도넛";
		donut.radius = 4;
		double dArea = donut.getArea();
		
		System.out.println(donut.name+"의 면적 >> "+dArea);
		//===================================================
		//생성자에 초기값을 넣어서 객체 1개를 더 만들기.
		
		Circle ball = new Circle(6, "드림");
		float bArea = (float)ball.getArea();
		
		System.out.println(ball.name+"의 면적 >>  "+bArea);
	}
}
