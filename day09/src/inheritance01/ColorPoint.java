package inheritance01;

// ���
public class ColorPoint extends Point{
	private String color;
	//������
	public ColorPoint() {}
	public ColorPoint(int x, int y, String color) {
		super(x, y); //�ݵ�� ù ��° ���̿�����.
		// TODO Auto-generated constructor stub
		this.color = color;
	}
	
	// �޼ҵ�
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.println(color);
		//��� ����
		showPoint();
	}
}
