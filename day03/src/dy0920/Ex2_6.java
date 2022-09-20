package dy0920;
//20221021_박소현_220920
/*
 * 대입 연산자
 * 증감 연산자
 * ==========================================
 * 조건 연산자 ? (if - else을 간결하게 표현할 수 있음)
 * condition ? opr2 : opr3
 * 세 개의 피연산자로 구성된 삼항 연산자
 * condition이 t이면, 연산식의 결과는 opr2, f이면 opr3
 * ==========================================
 * 비트 연산 (1byte = 8bit)
 *   = 비트 논리 연산 : 비트 끼리 and, or, xor, not
 *   = 비트 시프트 연산 :  비트를 오른쪽(>>)이나 왼쪽(<<)으로 이동
 *   **/
public class Ex2_6 {
	public static void main(String[] args) {
		
		int a = 3, b = 3, c=3;
		
		//대입 연산자 사례
		a += 3;
		b *= 3;
		c %= 2;
		System.out.println("a = "+a+", b = "+b+", c = "+c);
		
		int d = 3;
		//증감 연산자 사례
		a = d++;
		System.out.println("a = "+a+", d = "+d);
		a = ++d;
		System.out.println("a = "+a+", d = "+d);
		System.out.println("===================");
		
		//삼항(조건) 연산자 사례
		int i = 3, j =5;
		System.out.println("두 수의 차는 "+((i > j)?(i - j):(i - j)));
	}
}
