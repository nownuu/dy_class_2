package obj03;

public class StudentEx {
	public static void main(String[] args) {
		Student kg = new Student("문빈", "0126", 25);
		kg.printStudent();
		
		Student ch = new Student("으누", "0127", 26);
		ch.printStudent();
		
		System.out.println("중간 학생 수 >> "+Student.cnt);
		
		Student me = new Student("소현", "0106", 25);
		me.printStudent();
		
		Student su = new Student("슈화", "1004", 21);
		su.printStudent();
		
		System.out.println("최종 학생 수 >> "+Student.cnt);
	}
}
