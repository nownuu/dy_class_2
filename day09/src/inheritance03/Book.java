package inheritance03;

public class Book {
	private String title;
	private int pages;
	private String author;
	
	public Book() {}

	public Book(String title, int pages, String author) {
		this.title = title;
		this.pages = pages;
		this.author = author;
	};
	
	void printBook() {
		System.out.print(title+", "+pages+", "+author+", ");
	}
}
