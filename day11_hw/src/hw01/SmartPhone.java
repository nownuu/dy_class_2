package hw01;

public class SmartPhone extends Phone implements PhoneInterface{
	String osType;
	int memory;
	boolean bt;
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	public SmartPhone (String pNum, String pMake, int price, String osType, int memory, boolean bt) {
		super(pNum, pMake, price);
		this.osType = osType;
		this.memory = memory;
		this.bt = bt;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public boolean isBt() {
		return bt;
	}

	public void setBt(boolean bt) {
		this.bt = bt;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()
				+", 운영체제 타입 : "+osType+", 내부 메모리 크기 : "+memory+", 블루투스 지원 여부 : "+bt;
	}

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("전화 하는 중");
	}

	@Override
	public void reviceCall() {
		// TODO Auto-generated method stub
		System.out.println("전화 왔어요");	
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자 갑니다.");
	}

	@Override
	public void reviceSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자 왔어요.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("음악 연주합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("음악 중단합니다.");
	}
}
