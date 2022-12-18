package test02;

public class TV {
	int tMake;
	int price;
	int tSize;
	
	public TV() {}
	public TV(int tMake, int price, int tSize) {
//		super();
		this.tMake = tMake;
		this.price = price;
		this.tSize = tSize;
	}
	public int gettMake() {
		return tMake;
	}
	public void settMake(int tMake) {
		this.tMake = tMake;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int gettSize() {
		return tSize;
	}
	public void settSize(int tSize) {
		this.tSize = tSize;
	}
	@Override
	public String toString() {
		return "제조사 =" + tMake + ", 가격 = " + price + ", 크기 =" + tSize ;
	}
}
