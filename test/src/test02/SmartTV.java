package test02;

public class SmartTV extends TV implements TvInterface{
	private int tType;
	private boolean internet;
	private boolean buletooth;
	
	public SmartTV() {}
	public SmartTV(int tMake, int price, int tSize, int tType, boolean internet, boolean buletooth) {
		super(tMake, price, tType);
		this.tType = tType;
		this.internet = internet;
		this.buletooth = buletooth;
	}
	
	public int gettType() {
		return tType;
	}
	public void settType(int tType) {
		this.tType = tType;
	}
	public boolean isInternet() {
		return internet;
	}
	public void setInternet(boolean internet) {
		this.internet = internet;
	}
	public boolean isBuletooth() {
		return buletooth;
	}
	public void setBuletooth(boolean buletooth) {
		this.buletooth = buletooth;
	}
	@Override
	public void youtubePlay() {
		System.out.println(">>>>>> ��Ʃ�� ��û ����");
		
	}
	@Override
	public void youtubeStop() {
		System.out.println(">>>>>> ��Ʃ�� ��û ����");
		
	}
	@Override
	public void internetPlay() {
		System.out.println(">>>>>> ���ͳ� ����");
		
	}
	@Override
	public void internetStop() {
		System.out.println(">>>>>> ���ͳ� ����");
		
	}
	@Override
	public String toString() {
		return super.toString() + "Ÿ�� =" + tType + ", ���ͳ� ���ɿ��� =" + internet + ", ������� ���ɿ���=" + buletooth;
	}
	
	
}
