package interface01;

public class InterfaceEx {
	public static void main(String[] args) {
		SamPhone sp = new SamPhone("�ø�4", "010-2022-0808");
		sp.sendCall();
		sp.receiveCall();
		
		Iphone ip = new Iphone();
		ip.sendCall();
		ip.receiveCall();
		
//		System.out.println("\n������� ��ü�� >> "+);
	}
}
