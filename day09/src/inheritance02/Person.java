package inheritance02;
/*상속 횟수 무제한
 * 상속의 최상위 조상 클래스는 java.lang.Object 클래스 / 자동 생성
 * 클래스의 다중 삭속 지원하지 않음.(부모는 1명)
 * 
 * 서브클래스의 생성자와 슈퍼 클래스의 생성자는 둘다 실행되고,  슈퍼 클래스가 먼저 실행 된다.
 * 
 * super() = 서브 클래스에서 명시적으로 슈퍼 클래스의 생성자 선택 호출
 * 
 * 
 * */
public class Person {
    private String name;
	private String addr;
	private String phone;
	
	public Person() {};
	public Person(String name, String addr, String phone) {
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	
	void printPerson() {
		System.out.println(name+", "+addr+", "+phone);
	}
}