package prac_obj01;

public class StudentEx {
	public static void main(String[] args) {
		Student mem = new Student("박소현", 20221021, 25);
		mem.stulist();
		
		// 출력 생성자 2의 출력 코드
		int memFu = mem.stuFu();
		System.out.println(mem.stuName+"의 10년 뒤 나이는 "+memFu);
	}
}
