package dy1206;

public class StudentEX {
	public static void main(String[] args) {
		Person p1 = new Person("����", "û��", "010-1234-4567");
		System.out.println(p1); //��ü�� �ּҰ� ���
		//getter setter ������ : �ʵ尡 private �� ������
//		p1.addr = "����Ư����";
//		p1.phone="010-2345-2345";
		p1.setAddr("����");
		p1.setPhone("010-5555-6565");
		System.out.println(p1.getName()+" "+p1.getAddr()+" "+p1.getPhone());
		
		Student s1 = new Student();
		s1.setStuId(101);
		s1.setJeongong("��ǻ�Ͱ���");
		System.out.println(s1.getStuId()+" "+s1.getJeongong());
		
		Student s2 = new Student("����", "û��", "010-7623-9829", 103, "�ǿ�����");
		System.out.println(s2);
		s2.setJeongong("�濵�а�");
		System.out.println(s2.getName()+" "+s2.getJeongong());
		
		Student s3 = new Student("�����", "����", "010-5555-2222", 2022, "ü���а�");
		Student s4 = new Student("�����", "����", "010-5555-2222", 2022, "ü���а�");
		
		if(s3 == s4) {
			System.out.println("����� ��ü �´�.");
		} else {
			System.out.println("����� ��ü �ƴϴ�. (;;)");
		}
		
		if(s3.getName().equals(s4.getName())) {
			System.out.println("������̳�");
		} else {
			System.out.println("�ƴϳ� (;;)");
		}
		
		if(s3.getName().equals(s4.getName())) {
			System.out.println("������Դϴ�.");
		} else {
			System.out.println("�ƴ�.");
		}
	}
}