package obj03;

public class Student {
	// 1. �ʵ�
	String name;
	String stuid;
	int age;
	
	//��ü�� �󸶳� ����������� ī��Ʈ.
	//int cnt; �� �����ϸ� cnt �� ��� 1�� ��µȴ�.
	//�տ� static�� ������ ������ ��ü�� ��������� �ʰ� class ���� 1���� ���������.
	//�ڡڡ�
	static int cnt; 
	
	// 2. ������
	public Student() {}
	public Student(String name, String stuid, int age) {
		this.name = name;
		this.stuid = stuid;
		this.age = age;
		cnt ++;
	}
	
	// 3. �޼ҵ�
	void printStudent() {
		System.out.print(name +"\t"+stuid+"\t"+age);
		System.out.println("\t\t�л� �� >>\t"+cnt);
	}
}
