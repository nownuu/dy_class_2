package inheritance04;

public class B01 extends A01{
	public B01() {
		System.out.println("생성자 B");
	}
	public B01(int x) {
		super(x);
		System.out.println("매개변수 생성자 B"+x);
	}
}
