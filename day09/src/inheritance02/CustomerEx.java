package inheritance02;

public class CustomerEx {
	public static void main(String[] args) {
		
		Customer cs1 = new Customer("�ڼ���", "��⵵", "010-7777", 1, 1000);
		cs1.printCus();
		
		Customer cs2 = new Customer("������", "����", "010-7887",  2, 10000);
		cs2.printCus();
	}
}