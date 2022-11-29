package obj01;
/*
 * this() - 생성자 안에서 다른 생성자를 불러옴.
 * static void main -> 객체 == 생성자 호출
 * */
public class Book {
	// 1.필드
	String title, author;
	
	// 2. 생성자
	public Book() {}
	
	public Book(String title) {
		this(title, "작자 미상");
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// 3. 메소드
	void show() {
		System.out.println(title + ", "+author);
	}
}
