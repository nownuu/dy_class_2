package inheritance03;

public class TextBookEx {
	public static void main(String[] args) {
		
		TextBook tb1 = new TextBook("�ڹ����α׷���", 100,"Ȳ����", "1�г� 1�б�", "����̷����б�");
		tb1.printTextBook();
		
		TextBook tb2 = new TextBook("����", 40, "������", "1�г� 1�б�", "���� �ʵ��б�");
		tb2.printTextBook();
	}
}
