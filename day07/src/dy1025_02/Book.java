package dy1025_02;

public class Book {
	String title;
	String author;
	
	public Book() {}

	public Book(String title) {
		this.title = title;
		author = "작자 미상";
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void printBook() {
		System.out.println(this.title + ", "+this.author);
	}
}
