package overriding02;

public class Overriding {
	public static void main(String[] args) {
		Weapon wp;
		wp = new Weapon();
		System.out.println("기본 무기의 살상 능력은 "+wp.fire());
		
		wp = new Cannon();
		System.out.println("대포의 살상 능력은 "+wp.fire());
	}
}
