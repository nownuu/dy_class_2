package inheritance02;
/*��� Ƚ�� ������
 * ����� �ֻ��� ���� Ŭ������ java.lang.Object Ŭ���� / �ڵ� ����
 * Ŭ������ ���� ��� �������� ����.(�θ�� 1��)
 * 
 * ����Ŭ������ �����ڿ� ���� Ŭ������ �����ڴ� �Ѵ� ����ǰ�,  ���� Ŭ������ ���� ���� �ȴ�.
 * 
 * super() = ���� Ŭ�������� ��������� ���� Ŭ������ ������ ���� ȣ��
 * 
 * 
 * */
public class Person {
    private String name;
	private String addr;
	private String phone;
	
	public Person() {};
	public Person(String name, String addr, String phone) {
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	
	void printPerson() {
		System.out.println(name+", "+addr+", "+phone);
	}
}