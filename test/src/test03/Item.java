package test03;

public class Item {
	
	// 상품 번호, 이름, 가격
	private int no;
	private String name;
	private int price;
	private int kind;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int no, String name, int price, int kind) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		this.kind = kind;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Item [no=" + no + ", name=" + name + ", price=" + price + ", kind=" + kind;
	}
}
