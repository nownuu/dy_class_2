package dy1206;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Student> stList = new ArrayList<Student>();
		Student st1 = new Student("ȫ�浿",	"��⵵ �����", "010-9988-2911", 2022, "�ļ�");
		Student st2 = new Student("������",	"����Ư����", "010-9788-2911", 2022, "����");
		Student st3 = new Student("���ҿ�",	"���ֱ�����", "010-1234-2911", 2020, "�ļ�");
		
		stList.add(st1);
		stList.add(st2);
		stList.add(st3);
		
		for(int i = 0; i<stList.size(); i++) {
			Student st = stList.get(i);
			System.out.println(st.getName()+ " "+ st.getAddr());
//			System.out.println(stList.get(i).getName() + " "+ stList.get(i).getAddr());
		}
		
		System.out.println();
		// st �߿��� ���￡ ��� �л��� �̸��� ��ȭ��ȣ�� ���
		for(int i = 0; i<stList.size(); i++) {
			Student st = stList.get(i);
			if(st.getAddr() .equals("����Ư����")) {
				System.out.println(st.getName()+ " "+ st.getPhone());
			}
		}
		
		System.out.println();
		
		// st �߿��� ������ �ļ��� �л��� �̸��� ��ȭ��ȣ ���
		for(int i = 0; i<stList.size(); i++) {
			Student st = stList.get(i);
			if(st.getJeongong().equals("�ļ�")) {
				System.out.println(st.getName()+ " "+ st.getPhone());
			}
		}
	}
}
