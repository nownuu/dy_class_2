package inheritance03;

public class TextBookEx {
	public static void main(String[] args) {
		
		TextBook tb1 = new TextBook("자바프로그래밍", 100,"황기태", "1학년 1학기", "동양미래대학교");
		tb1.printTextBook();
		
		TextBook tb2 = new TextBook("국어", 40, "선생님", "1학년 1학기", "서울 초등학교");
		tb2.printTextBook();
	}
}
