package inheritance01;
/*
 * ��ü ������ ���
 * �θ�Ŭ������ ������� �ʵ�, �޼ҵ带 �ڽ� Ŭ������ ���� ����.
 * ������ Ư���� �������� �ڵ尡 ��������(�ߺ� ����)
 * 
 *  ����� ���� : Ŭ������ ����ȭ, Ŭ���� ���� ����, 
 *  	����Ʈ������ ���꼺 ���(Ŭ���� ����� Ȯ�� ����, Ŭ������ �ۼ� �ӵ� ����)
 *  
 *  �θ� Ŭ���� == ���� Ŭ���� // �ڽ� Ŭ���� == ���� Ŭ����
 *  extends Ű���� ���
 * */
public class Point {
	private int x;
	private int y;
	
	// ������
	public Point() {}
	public Point(int x, int y) {
		this.x  = x;
		this.y = y;
	}
	
	// �޼ҵ�
	public void set(int x, int y) {
		this.x  = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("("+x+", "+y+")");
	}
}
