package test01;

public class SmartPhone extends Phone implements PhoneInterface{
	private int ptype;
	private int memory;
	
	public SmartPhone(){}
	public SmartPhone(String pname, int maker, int price, int ptype, int memory) {
		super(pname, maker, price);
		this.ptype = ptype;
		this.memory = memory;
	}

	public int getPtype() {
		return ptype;
	}
	public void setPtype(int ptype) {
		this.ptype = ptype;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ �̴ϴ�. �ѷ����");
	}
	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ �Ծ��. ��������");
	}
	@Override
	public String toString() {
		return super.toString() + " OS =" + ptype + ", ����ũ�� =" + memory + "MB";
	}	
	
	
}
