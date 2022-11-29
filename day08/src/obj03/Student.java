package obj03;

public class Student {
	// 1. 필드
	String name;
	String stuid;
	int age;
	
	//객체가 얼마나 만들어졌는지 카운트.
	//int cnt; 로 설정하면 cnt 가 계속 1로 출력된다.
	//앞에 static이 붙으면 각각의 객체에 만들어지지 않고 class 내에 1개만 만들어진다.
	//★★★
	static int cnt; 
	
	// 2. 생성자
	public Student() {}
	public Student(String name, String stuid, int age) {
		this.name = name;
		this.stuid = stuid;
		this.age = age;
		cnt ++;
	}
	
	// 3. 메소드
	void printStudent() {
		System.out.print(name +"\t"+stuid+"\t"+age);
		System.out.println("\t\t학생 수 >>\t"+cnt);
	}
}
