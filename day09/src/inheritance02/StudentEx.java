package inheritance02;

public class StudentEx {
	public static void main(String[] args) {
		
		Student st1 = new Student("�ڼ���", "����", "010-0000", 2022, "�ļ�");
		st1.printStudent();
		
		Student st2 = new Student("����", "û��", "010-1111", 2022, "�ǿ�����");
		st2.printStudent();
	}
}
