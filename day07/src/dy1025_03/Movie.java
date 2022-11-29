package dy1025_03;

public class Movie {
	String title;
	String author;
	float score;
	int year;
	
	public Movie() {}
	
	public Movie(String title, String author, float score, int year) {
		this.title = title;
		this.author = author;
		this.score = score;
		this.year = year;
	}
	
	public void print() {
		System.out.println(this.title+"의 영화 감독 이름은 "+this.author+"입니다.");
		System.out.println(this.year+"년에 개봉하였으며 "+this.score+"점을 받았습니다.");
	}
}
