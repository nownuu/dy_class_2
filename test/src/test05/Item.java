package test05;

public class Item {
	private String name;
	private int price;
	private int maker;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(String name, int price, int maker) {
//		super();
		this.name = name;
		this.price = price;
		this.maker = maker;
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

	public int getMaker() {
		return maker;
	}

	public void setMaker(int maker) {
		this.maker = maker;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", maker=" + maker + "]";
	}
	
}
