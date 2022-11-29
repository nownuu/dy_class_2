package dy1025_03;

public class MovieEx {
	public static void main(String[] args) {
		Movie hjMovie = new Movie();
		hjMovie.title = "헤어짐의 결심";
		hjMovie.author = "박찬욱";
		hjMovie.score = (float)4.0;
		hjMovie.year = 2022;
		
		hjMovie.print();
		
		//=====================
		
		System.out.println();
		Movie koreaMovie = new Movie("코드네임", "아나스타샤", (float)4.4, 2009);
		koreaMovie.print();
	}
}
