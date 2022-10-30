package dy1025_02;

public class BookEx {
	public static void main(String[] args) {
		Book littleP = new Book("어린왕자", "생텍쥐베리");
		littleP.printBook();
		
		Book loveStory = new Book("춘향전");
		loveStory.printBook();
		
		Book homes = new Book();
		homes.title = "셜록홈즈";
		homes.author="아서코난 도일";
		homes.printBook();
		
		Book pCo = new Book("홈 그라운드", "감독");
		pCo.printBook();
	}
}
