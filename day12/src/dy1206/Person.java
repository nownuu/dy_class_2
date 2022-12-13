package dy1206;

//설계도
public class Person {
    private String name;
	private String addr;
	private String phone;
	
	public Person() {
		// TODO Auto-generated constructor stub
	} //기본 생성자

	public Person(String name, String addr, String phone) {
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}

	// 메소드 getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : "+name+", 주소 :"+addr+", 전화번호 : "+phone;
	}
}
