package inheritance04;

public class B01 extends A01{
	public B01() {
		System.out.println("������ B");
	}
	public B01(int x) {
		super(x);
		System.out.println("�Ű����� ������ B"+x);
	}
}
