package test05;

public class Cart extends Item implements CartInterface{
	int cnt;
	int os;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(String name, int price, int maker, int cnt, int os) {
		super(name, price, maker);
		this.cnt = cnt;
		this.os = os;
	}

	
	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getOs() {
		return os;
	}

	public void setOs(int os) {
		this.os = os;
	}

	@Override
	public void addCart() {
		// TODO Auto-generated method stub
		System.out.println("1");
	}

	@Override
	public void clearCart() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}

	@Override
	public void removeCart() {
		// TODO Auto-generated method stub
		System.out.println("3");
	}

	@Override
	public String toString() {
		return super.toString()+"Cart [cnt=" + cnt + ", os=" + os + "]";
	}
}
