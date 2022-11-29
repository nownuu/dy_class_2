package obj01;

import java.util.Scanner;

public class BookArray {
	public static void main(String[] args) {
		Book [] book = new Book[2];
		
		Scanner sc = new Scanner(System.in);
		
		// 입력
		for(int i=0; i<book.length; i++) {
			System.out.println("제목 >>");
			String title = sc.next();
			System.out.println("저자>>");
			String author = sc.next();
			
			book[i] = new Book(title, author);
		}
		
		//출력
		for(int i= 0; i<book.length; i++) {
			System.out.println("(" + book[i].title+", "+book[i].author+")");
		}
		
		sc.close();
	}
}
