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
		System.out.println("전화 겁니다. 뚜루루루루");
	}
	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화 왔어요. 따르르릉");
	}
	@Override
	public String toString() {
		return super.toString() + " OS =" + ptype + ", 저장크기 =" + memory + "MB";
	}	
	
	
}
