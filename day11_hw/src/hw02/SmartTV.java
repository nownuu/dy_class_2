package hw02;

public class SmartTV extends TV implements TVInterface{
	String type;
	boolean internet;
	boolean bt;
	
	public SmartTV() {
		// TODO Auto-generated constructor stub
	}

	public SmartTV(String tMake, int tPrice, String tSize, String type, boolean internet, boolean bt) {
		super(tMake, tPrice, tSize);
		this.type = type;
		this.internet = internet;
		this.bt = bt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isInternet() {
		return internet;
	}

	public void setInternet(boolean internet) {
		this.internet = internet;
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
		return super.toString()+", Ÿ�� : "+type+", ���ͳ� ���� : "+internet+", ������� ���� ���� : "+bt;
	}

	@Override
	public void youtubePlay() {
		// TODO Auto-generated method stub
		System.out.println("��Ʃ�� �÷��� ��");
	}

	@Override
	public void youtubeStop() {
		// TODO Auto-generated method stub
		System.out.println("��Ʃ�� �÷��� ��ž");
	}

	@Override
	public void internetPlay() {
		// TODO Auto-generated method stub
		System.out.println("���ͳ� ��");
	}

	@Override
	public void internetStop() {
		// TODO Auto-generated method stub
		System.out.println("���ͳ� ��ž");
	}
}
