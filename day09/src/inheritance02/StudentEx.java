package inheritance02;

public class StudentEx {
	public static void main(String[] args) {
		
		Student st1 = new Student("박소현", "광명", "010-0000", 2022, "컴소");
		st1.printStudent();
		
		Student st2 = new Student("문빈", "청주", "010-1111", 2022, "실용음악");
		st2.printStudent();
	}
}
