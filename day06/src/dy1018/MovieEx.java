package dy1018;

public class MovieEx {
	public static void main(String[] args) {
		Movie mv = new Movie();
		
		mv.title = "medic";
		mv.score = (float) 4.5;
		mv.name = "sanitized";
		mv.date = 2022;
		
		System.out.println(mv.title + " "+mv.score+" "+mv.name+" "+mv.date);
		mv.print();
		
		Movie mv2 = new Movie();
		
		mv2.title = "java pro";
		mv2.score = (float) 3.0;
		mv2.name = "programming";
		mv2.date = 2018;
		
		System.out.println(mv2.title + " "+mv2.score+" "+mv2.name+" "+mv2.date);
		mv2.print();
	}
}
