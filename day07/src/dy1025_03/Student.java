package dy1025_03;

public class Student {
	String name;
	int stuId, age;
	String phone;
	
	public Student() {}
	
	public Student(String name, int stuId, int age, String phone) {
		this.name = name;
		this.stuId = stuId;
		this.age = age;
		this.phone = phone;
	}
	
	public void printStudent() {
		System.out.println(this.name+"\t"+this.stuId+"\t"+this.age+"\t"+this.phone);
	}
}
