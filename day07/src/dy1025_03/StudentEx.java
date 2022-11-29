package dy1025_03;

public class StudentEx {
	public static void main(String[] args) {
		Student member = new Student("박소현", 20221021, 25, "010-9876-7654");
		member.printStudent();
		
		Student nMem = new Student();
		nMem.name = "문빈";
		nMem.stuId = 20221000;
		nMem.age = 20;
		nMem.phone = "010-1234-1234";
		nMem.printStudent();
	}
}
