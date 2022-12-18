package test03;

public class Cart extends Item implements CartInterface{
	int cnt; //개수

	public Cart() {
		// TODO Auto-generated constructor stub
	}
	public Cart(int no, String name, int price, int kind, int cnt) {
		super(no, name, price, kind);
		// TODO Auto-generated constructor stub
		this.cnt = cnt;
	}

	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	@Override
	public void addCart() {
		// TODO Auto-generated method stub
		System.out.println("장바구니에 추가합니다.");
	}

	@Override
	public void removeCart() {
		// TODO Auto-generated method stub
		System.out.println("장바구니에서 제거합니다.");
	}

	@Override
	public void clearCart() {
		// TODO Auto-generated method stub
		System.out.println("빈 장바구니 입니다.");
	}
	
	@Override
	public String toString() {
		return super.toString()+ "  cnt=" + cnt + "]";
	}
}
