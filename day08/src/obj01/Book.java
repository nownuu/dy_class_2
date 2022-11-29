package obj01;
/*
 * this() - ������ �ȿ��� �ٸ� �����ڸ� �ҷ���.
 * static void main -> ��ü == ������ ȣ��
 * */
public class Book {
	// 1.�ʵ�
	String title, author;
	
	// 2. ������
	public Book() {}
	
	public Book(String title) {
		this(title, "���� �̻�");
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// 3. �޼ҵ�
	void show() {
		System.out.println(title + ", "+author);
	}
}
