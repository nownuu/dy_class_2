package prac_obj01;

public class StudentEx {
	public static void main(String[] args) {
		Student mem = new Student("�ڼ���", 20221021, 25);
		mem.stulist();
		
		// ��� ������ 2�� ��� �ڵ�
		int memFu = mem.stuFu();
		System.out.println(mem.stuName+"�� 10�� �� ���̴� "+memFu);
	}
}
