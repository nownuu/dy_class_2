package hw01;

public class SmartPhoneEX {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("010-7777-5555", "�Ｚ", 8700000, "�ȵ���̵�", 512, true);
		System.out.println(sp);
		sp.sendCall();
		sp.reviceCall();
		sp.play();
		sp.stop();
		sp.sendSMS();
		sp.reviceSMS();
	}
}
