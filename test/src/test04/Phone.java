package test04;

public class Phone {
	String pName;
	int pMaker;
	int price;
	
	static int count;
	
	public Phone() {
		// TODO Auto-generated constructor stub
		count++;
	}

	public Phone(String pName, int pMaker, int price) {
//		super();
		this.pName = pName;
		this.pMaker = pMaker;
		this.price = price;
		count++;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpMaker() {
		return pMaker;
	}

	public void setpMaker(int pMaker) {
		this.pMaker = pMaker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [pName=" + pName + ", pMaker=" + pMaker + ", price=" + price + "]";
	}
	
}
