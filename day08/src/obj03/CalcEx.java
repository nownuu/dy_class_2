package obj03;
/*final = ������ �ʴ� ��� (������ / �ڽ� Ŭ������ ����==��� �Ұ�)
 * ��� ���� �� �빮�� ���*/
class Calc{
	public Calc() {}
	public static int abs(int a) { //���밪�� ����.
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
		//static �� �پ������� ��ü�� ���� ��������� �ʾƵ� ������.
		
		int r1 = Calc.abs(-5);
		int r2 = Calc.max(10, 8);
		int r3 = Calc.min(10, 8);
		System.out.println("Calc.abs(-5) >> "+r1);
		System.out.println("Calc.max(10, 8) >> "+r2);
		System.out.println("Calc.max(10, 8) >> "+r3);
		
		
		// ���밪
		int r4= Math.abs(-10);
		System.out.println("Math.abs(-10) >> "+r4);
		System.out.println(	(int)Math.pow(2, 3)); //����

	}
}
