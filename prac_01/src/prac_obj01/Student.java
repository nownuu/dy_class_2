package prac_obj01;

public class Student {
	//�л� Ŭ���� �����
	//public = �������� || class || Student
	
	String stuName;
	int stuNum;
	int stuAge;
	
	//�⺻ ������ �޼ҵ�
	public Student() {}
	
	//������
	public Student(String stuName, int stuNum, int stuAge) {
		//this = ��ü �ڽ��� ���۷���
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuNum = stuNum;
	}
	
	//��� ������
	public void stulist() {
		System.out.println(stuName+"�� �й��� " +stuNum + "�Դϴ�." );
		System.out.println(stuName+"�� ���̴� " +stuAge + "�Դϴ�." );
	}
	
	//��� ������ 2
	public int stuFu() {
		return stuAge + 10;
	}
}
