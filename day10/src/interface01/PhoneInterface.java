package interface01;

public interface PhoneInterface {
	int TIMEOUT = 10000; //public fianl ����
	void sendCall(); 
	void receiveCall(); //public abstract ����

}

class SamPhone implements PhoneInterface{

	private String model;
	private String phoneNo;

	
	public SamPhone() {};
	public SamPhone(String model, String phoneNo) {
		this.model = model;
		this.phoneNo = phoneNo;
	}
	
	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ >> �ѷ���� �ѷ��");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ >> ��ȭ�Ծ��.");
	}
}

class Iphone implements PhoneInterface{

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("���� >> �ѷ���� �ѷ��");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("���� >> ��ȭ�Ծ��.");
	}
	
}