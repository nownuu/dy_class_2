package dy1206;

public class Student extends Person{
	private int stuId;
	private String jeongong;
	
	public Student() {}
	public Student(String name, String addr, String phone, int stuId, String jeongong) {
		super(name, addr, phone);
		this.stuId = stuId;
		this.jeongong = jeongong;
	}
	
	//�޼ҵ�
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getJeongong() {
		return jeongong;
	}
	public void setJeongong(String jeongong) {
		this.jeongong = jeongong;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", �й� : "+stuId+", ���� : "+jeongong;
	}

}