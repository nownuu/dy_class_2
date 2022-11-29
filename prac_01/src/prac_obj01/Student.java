package prac_obj01;

public class Student {
	//학생 클래스 만들기
	//public = 접근제한 || class || Student
	
	String stuName;
	int stuNum;
	int stuAge;
	
	//기본 생성자 메소드
	public Student() {}
	
	//생성자
	public Student(String stuName, int stuNum, int stuAge) {
		//this = 객체 자신의 레퍼런스
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuNum = stuNum;
	}
	
	//출력 생성자
	public void stulist() {
		System.out.println(stuName+"의 학번은 " +stuNum + "입니다." );
		System.out.println(stuName+"의 나이는 " +stuAge + "입니다." );
	}
	
	//출력 생성자 2
	public int stuFu() {
		return stuAge + 10;
	}
}
