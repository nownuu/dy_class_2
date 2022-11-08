package obj03;

/*
 * �ڹ��� ���� ������ 4����
 *  * ��ü ���� ����� ĸ��ȭ ��å
 * public | protected | ����Ʈ(���� ������ ����) | private
 * ��� Ŭ���� | ���� ��Ű��&�ڽ���Ű�� | ���� ��Ű�� | �ܺη� �Ϻ� ����
 * --
 * Ŭ������ �Ϻ� ����� �����Ͽ� �ٸ� Ŭ�������� �����ϵ��� ���
 * 
 * class�� �� ���� ��� main�� ���� Ŭ������ ���ϸ��� �������ش�.
 * */

class Sample{ //public �� �ΰ� �� ������ error!
	public int a;
	private int b;
	int c; // ����Ʈ
	protected int d;
	
	public Sample() {}
	public Sample(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
}
public class AccessEx {
	public static void main(String[] args) {
		Sample aObj = new Sample();
		aObj.a = 10;
//		aObj.b = 10; private Error!
		aObj.c = 10;
		aObj.d = 10; // ���� ��Ű���� ����
	}
}
