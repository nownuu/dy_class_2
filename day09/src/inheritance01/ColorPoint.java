package inheritance01;

// 상속
public class ColorPoint extends Point{
	private String color;
	//생성자
	public ColorPoint() {}
	public ColorPoint(int x, int y, String color) {
		super(x, y); //반드시 첫 번째 줄이여야함.
		// TODO Auto-generated constructor stub
		this.color = color;
	}
	
	// 메소드
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.println(color);
		//상속 받음
		showPoint();
	}
}
