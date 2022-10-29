package dy1018;

public class StudentEx {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "박소현";
		stu.stuId = 20221021;
		stu.age = 20;
		stu.phone = "010-9999-9999";
		
		System.out.println(stu.name+" "+stu.stuId+"번 "+stu.age+"살 "+stu.phone);
		
		/*===============================*/
		Student stu1 = new Student();
		
		System.out.println(">>");
		stu1.name = "슈화";
		stu1.stuId = 20222222;
		stu1.age = 20;
		stu1.phone = "010-7878-7878";
		
		System.out.println(stu1.name+" "+stu1.stuId+"번 "+stu1.age+"살 "+stu1.phone);
		
	}
}
