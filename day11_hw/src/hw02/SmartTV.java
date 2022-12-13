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
		return super.toString()+", 타입 : "+type+", 인터넷 가능 : "+internet+", 블루투스 가능 여부 : "+bt;
	}

	@Override
	public void youtubePlay() {
		// TODO Auto-generated method stub
		System.out.println("유튜브 플레이 온");
	}

	@Override
	public void youtubeStop() {
		// TODO Auto-generated method stub
		System.out.println("유튜브 플레이 스탑");
	}

	@Override
	public void internetPlay() {
		// TODO Auto-generated method stub
		System.out.println("인터넷 온");
	}

	@Override
	public void internetStop() {
		// TODO Auto-generated method stub
		System.out.println("인터넷 스탑");
	}
}
