package test01;

// 설계도
public class Phone{
	// 필드
	String pname;
	int maker;
	int price;
	
	public Phone() {} //기본생성자
	public Phone(String pname, int maker, int price) {
		super();
		this.pname = pname;
		this.maker = maker;
		this.price = price;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getMaker() {
		return maker;
	}
	public void setMaker(int maker) {
		this.maker = maker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "이름=" + pname + ", 제조사=" + maker + ", 가격=" + price ;
	}
}
