package interface01;

/*�������̽��� �ٸ� �������̽� ���
 * 1. extends Ű���� ��� 
 * 2. ���� �������̽� ���
 * 
 * == Ŭ������ �������� �����ϱ� ���� �������̽��� ����Ѵ�.
 * ex) �԰��� ������ ���ε鸸�� ������� ���� .
 * 
 * interface�� public�� abstract�� ����
 * */

public interface PhoneInterface {
	final int TIMEOUT = 10000;
	void sendCall();
	void reviceCall();
	default void printLoge() {
		System.out.println("** PHONE **");
	}
}

interface MobilePhoneInterface extends PhoneInterface{
	void sendSMS();
	void reviceSMS();
}

interface MP3Interface{
	public void play();
	public void stop();
}
