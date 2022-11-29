package inheritance02;

public class Student extends Person{
	private int stuId;
	private String jeongong;
	
	public Student() {};
	
	public Student(String name, String addr, String phone, int stuId, String jeongong) {
		super(name, addr, phone);
		// TODO Auto-generated constructor stub
		this.stuId = stuId;
		this.jeongong = jeongong;
	}

	 void printStudent() {
		printPerson();
		System.out.println(stuId+", "+jeongong);
	}
}
