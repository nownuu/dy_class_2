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
				+", �ü�� Ÿ�� : "+osType+", ���� �޸� ũ�� : "+memory+", ������� ���� ���� : "+bt;
	}

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ �ϴ� ��");
	}

	@Override
	public void reviceCall() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ �Ծ��");	
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("���� ���ϴ�.");
	}

	@Override
	public void reviceSMS() {
		// TODO Auto-generated method stub
		System.out.println("���� �Ծ��.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("���� �����մϴ�.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("���� �ߴ��մϴ�.");
	}
}
