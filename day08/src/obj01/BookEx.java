package obj01;

public class BookEx {
	public static void main(String[] args) {
		// Book이라는 설계도를 이용해서 출력하는 객체
		
		Book littlePrince = new Book("littlePrince", "생택쥐베리");
		Book loveStory = new Book("춘향전");
		
		littlePrince.show();
		loveStory.show();
		
		Book emptyBook = new Book();
		emptyBook.show(); //null 값 출력
	}
}
