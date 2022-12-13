package hw01;

public interface PhoneInterface {
	final int TIMEOUT = 10000;
	void sendCall();
	void reviceCall();
	void sendSMS();
	void reviceSMS();
	public void play();
	public void stop();
}