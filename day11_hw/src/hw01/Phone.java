package hw01;

public class Phone {
	String pNum;
	String pMake;
	int price;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public Phone(String pNum, String pMake, int price) {
		this.pNum = pNum;
		this.pMake = pMake;
		this.price = price;
	}

	public String getpNum() {
		return pNum;
	}

	public void setpNum(String pNum) {
		this.pNum = pNum;
	}

	public String getpMake() {
		return pMake;
	}

	public void setpMake(String pMake) {
		this.pMake = pMake;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "폰번호 : "+pNum+", 제조사 :"+pMake+", 가격 : "+price;
	}
}
