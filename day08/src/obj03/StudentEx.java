package obj03;

public class StudentEx {
	public static void main(String[] args) {
		Student kg = new Student("����", "0126", 25);
		kg.printStudent();
		
		Student ch = new Student("����", "0127", 26);
		ch.printStudent();
		
		System.out.println("�߰� �л� �� >> "+Student.cnt);
		
		Student me = new Student("����", "0106", 25);
		me.printStudent();
		
		Student su = new Student("��ȭ", "1004", 21);
		su.printStudent();
		
		System.out.println("���� �л� �� >> "+Student.cnt);
	}
}
