package interface01;

public class InterfaceEX {
	public static void main(String[] args) {
		SmartPhone ph = new SmartPhone();
		ph.printLoge();
		ph.sendCall();
		ph.play();
		System.out.println("3�� 5�� ���ϸ� "+ph.calculate(3, 5));
		ph.schedule();
	}
}
