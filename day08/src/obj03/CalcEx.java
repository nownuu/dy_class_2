package obj03;
/*final = 변하지 않는 상수 (마지막 / 자식 클래스가 없음==상속 불가)
 * 상수 선언 시 대문자 사용*/
class Calc{
	public Calc() {}
	public static int abs(int a) { //절대값을 구함.
		return (a>0)? a : -a;
	}
	public static int max(int a, int b) {
		return (a>b)? a : b;
	}
	public static int min(int a, int b) {
		return (a>b)? b : a;
	}
}
public class CalcEx {
	public static void main(String[] args) {
		//Calc c1 = new Calc();
		//static 이 붙어있으면 객체를 굳이 만들어주지 않아도 괜찮음.
		
		int r1 = Calc.abs(-5);
		int r2 = Calc.max(10, 8);
		int r3 = Calc.min(10, 8);
		System.out.println("Calc.abs(-5) >> "+r1);
		System.out.println("Calc.max(10, 8) >> "+r2);
		System.out.println("Calc.max(10, 8) >> "+r3);
		
		
		// 절대값
		int r4= Math.abs(-10);
		System.out.println("Math.abs(-10) >> "+r4);
		System.out.println(	(int)Math.pow(2, 3)); //제곱

	}
}
