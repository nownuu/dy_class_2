package inheritance01;

public class ColorPointEx {
	public static void main(String[] args) {
		
		Point p = new Point();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("»¡°­RED");
		cp.showColorPoint();
		
		ColorPoint cp2 = new ColorPoint(5, 6, "BlueÆÄ¶û");
		cp2.showColorPoint();
	}
}
	