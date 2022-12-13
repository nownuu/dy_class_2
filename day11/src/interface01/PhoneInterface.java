package interface01;

/*인터페이스가 다른 인터페이스 상속
 * 1. extends 키워드 사용 
 * 2. 다중 인터페이스 상속
 * 
 * == 클래스의 다형성을 실현하기 위해 인터페이스를 사용한다.
 * ex) 규격이 있으나 본인들만의 방법으로 만듦 .
 * 
 * interface는 public과 abstract이 생략
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
