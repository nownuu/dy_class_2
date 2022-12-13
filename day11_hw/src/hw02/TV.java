package hw02;

public class TV {
	String tMake;
	int tPrice;
	String tSize;
	
	public TV() {
		// TODO Auto-generated constructor stub
	}

	public TV(String tMake, int tPrice, String tSize) {
		this.tMake = tMake;
		this.tPrice = tPrice;
		this.tSize = tSize;
	}

	public String gettMake() {
		return tMake;
	}

	public void settMake(String tMake) {
		this.tMake = tMake;
	}

	public int gettPrice() {
		return tPrice;
	}

	public void settPrice(int tPrice) {
		this.tPrice = tPrice;
	}

	public String gettSize() {
		return tSize;
	}

	public void settSize(String tSize) {
		this.tSize = tSize;
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "제조사 : "+tMake+", 가격 : "+tPrice+", 크기 : "+tSize;
	}
}
