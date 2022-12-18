package wapper01;

public class CharacterEx {
	public static void main(String[] args) {
		
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('a'));
		
		char c1 = '4';
		char c2 = 'F';
		// static boolean >> isAlphabetic
		
		System.out.println(Character.isAlphabetic(c1));
		System.out.println(Character.isAlphabetic(c2));
		
		// static boolean >> isDigit
		System.out.println(Character.isDigit(c1));
		System.out.println(Character.isDigit(c2));
		
		System.out.println();
		if(Character.isDigit(c1)) {
			System.out.println(c1 + " => 숫자!");
		} 
		
		if(Character.isDigit(c2) == true) {
			System.out.println(c2+" => 숫자!");
		} else {
			System.out.println("숫자가 아니다.");
		}
		
		System.out.println("정수 >> "+ Integer.parseInt("100") );
		System.out.println("실수 >> "+Double.parseDouble("3.14"));
	}
}
