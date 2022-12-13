package wapper01;

public class StringEx {
	public static void main(String[] args) {
		/*
		 * String str1 = "abcd";
		 * 
		 * char data[]= {'a', 'b', 'c', 'd'}; String str2 = new String(data); String
		 * str3 = new String("abcd");
		 */
		
		String stra = "DongyangMirae Univ";
		String strb = new String ("Computer");
		
		//길이구하기
		System.out.println(stra + "의 길이 >> "+stra.length());
		System.out.println(stra.charAt(2));
		
		// 하나씩 출력
		for(int i=0;i<stra.length(); i++) {
			System.out.print(stra.charAt(i));
		}
		System.out.println();
		
		String strA = stra.toLowerCase();
		String stra1 = stra.toUpperCase();
		System.out.println(strA+"\n"+stra1);
		System.out.println();
		
		// 실습
		// 반대로 출력
		for(int i = strb.length()-1; i>=0; i--) {
			System.out.print(strb.charAt(i));
		}
		System.out.println();
		
		// 소문자면 대문자로 -> 대문자면 소문자로 
		for(int i=0;i<stra.length(); i++) {
			if(Character.isLowerCase(stra.charAt(i))) {
				System.out.print(Character.toUpperCase(stra.charAt(i)));
			} 
			if(Character.isUpperCase(stra.charAt(i))) {
				System.out.print(Character.toLowerCase(stra.charAt(i)));
			}
		}
	}
}
