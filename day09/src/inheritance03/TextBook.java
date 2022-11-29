package inheritance03;

public class TextBook extends Book{
	private String hakgi;
	private String school;
	
	public TextBook() {}

	public TextBook(String title, int pages, String author, String hakgi, String school) {
		super(title, pages, author);
		// TODO Auto-generated constructor stub
		this.hakgi = hakgi;
		this.school = school;
	}
	
	void printTextBook() {
		printBook();
		System.out.print(hakgi+", "+school+"\n");
	}
}
