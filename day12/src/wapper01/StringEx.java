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
		
		//���̱��ϱ�
		System.out.println(stra + "�� ���� >> "+stra.length());
		System.out.println(stra.charAt(2));
		
		// �ϳ��� ���
		for(int i=0;i<stra.length(); i++) {
			System.out.print(stra.charAt(i));
		}
		System.out.println();
		
		String strA = stra.toLowerCase();
		String stra1 = stra.toUpperCase();
		System.out.println(strA+"\n"+stra1);
		System.out.println();
		
		// �ǽ�
		// �ݴ�� ���
		for(int i = strb.length()-1; i>=0; i--) {
			System.out.print(strb.charAt(i));
		}
		System.out.println();
		
		// �ҹ��ڸ� �빮�ڷ� -> �빮�ڸ� �ҹ��ڷ� 
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
