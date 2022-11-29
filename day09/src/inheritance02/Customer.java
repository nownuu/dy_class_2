package inheritance02;

public class Customer extends  Person{
	private int cusNo;
	private int mile;
	
	public Customer() {};

	public Customer(String name, String addr, String phone, int cusNo, int mile) {
		super(name, addr, phone);
		// TODO Auto-generated constructor stub
		this.cusNo = cusNo;
		this.mile = mile;
	};
	
	void printCus() {
		printPerson();
		System.out.println(cusNo+", "+mile);
	}
}
