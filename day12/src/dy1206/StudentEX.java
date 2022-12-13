package dy1206;

public class StudentEX {
	public static void main(String[] args) {
		Person p1 = new Person("문빈", "청주", "010-1234-4567");
		System.out.println(p1); //객체의 주소가 출력
		//getter setter 없을때 : 필드가 private 라서 오류뜸
//		p1.addr = "서울특별시";
//		p1.phone="010-2345-2345";
		p1.setAddr("서울");
		p1.setPhone("010-5555-6565");
		System.out.println(p1.getName()+" "+p1.getAddr()+" "+p1.getPhone());
		
		Student s1 = new Student();
		s1.setStuId(101);
		s1.setJeongong("컴퓨터공학");
		System.out.println(s1.getStuId()+" "+s1.getJeongong());
		
		Student s2 = new Student("문빈", "청담", "010-7623-9829", 103, "실용음악");
		System.out.println(s2);
		s2.setJeongong("경영학과");
		System.out.println(s2.getName()+" "+s2.getJeongong());
		
		Student s3 = new Student("손흥민", "유럽", "010-5555-2222", 2022, "체육학과");
		Student s4 = new Student("손흥민", "유럽", "010-5555-2222", 2022, "체육학과");
		
		if(s3 == s4) {
			System.out.println("손흥민 객체 맞다.");
		} else {
			System.out.println("손흥민 객체 아니다. (;;)");
		}
		
		if(s3.getName().equals(s4.getName())) {
			System.out.println("손흥민이네");
		} else {
			System.out.println("아니네 (;;)");
		}
		
		if(s3.getName().equals(s4.getName())) {
			System.out.println("손흥민입니다.");
		} else {
			System.out.println("아님.");
		}
	}
}