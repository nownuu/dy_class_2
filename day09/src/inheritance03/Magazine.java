package inheritance03;

public class Magazine extends Book{
	private String date;
	
	 public Magazine() {}

	public Magazine(String title, int pages, String author, String date) {
		super(title, pages, author);
		// TODO Auto-generated constructor stub
		this.date = date;
	};
	 
	void printMagazine() {
		printBook();
		System.out.println(date);
	}
}
