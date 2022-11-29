package interface01;

public interface PhoneInterface {
	int TIMEOUT = 10000; //public fianl 积帆
	void sendCall(); 
	void receiveCall(); //public abstract 积帆

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
		System.out.println("伙己 >> 堆风风风风 堆风风");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("伙己 >> 傈拳吭绢夸.");
	}
}

class Iphone implements PhoneInterface{

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("局敲 >> 堆风风风风 堆风风");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("局敲 >> 傈拳吭绢夸.");
	}
	
}