package test03;

public class Cart extends Item implements CartInterface{
	int cnt; //����

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
		System.out.println("��ٱ��Ͽ� �߰��մϴ�.");
	}

	@Override
	public void removeCart() {
		// TODO Auto-generated method stub
		System.out.println("��ٱ��Ͽ��� �����մϴ�.");
	}

	@Override
	public void clearCart() {
		// TODO Auto-generated method stub
		System.out.println("�� ��ٱ��� �Դϴ�.");
	}
	
	@Override
	public String toString() {
		return super.toString()+ "  cnt=" + cnt + "]";
	}
}
