package overriding02;

public class Overriding {
	public static void main(String[] args) {
		Weapon wp;
		wp = new Weapon();
		System.out.println("�⺻ ������ ��� �ɷ��� "+wp.fire());
		
		wp = new Cannon();
		System.out.println("������ ��� �ɷ��� "+wp.fire());
	}
}
