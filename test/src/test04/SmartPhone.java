package test04;

public class SmartPhone extends Phone implements PhoneInterface{
	private int pType;
	private int memory;
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	public SmartPhone(String pName, int maker, int price, int pType, int memory) {
		super(pName, maker, price);
		this.pType = pType;
		this.memory = memory;
	}

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("전화 보내기");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화 받기");
	}

	@Override
	public String toString() {
		return "SmartPhone [pType=" + pType + ", memory=" + memory + "]";
	}
	
}
