package dy1025_03;

public class Dog {
	
	String name;
	String breed;
	int age;
	String color;
	
	public Dog() {}
	
	public Dog(String name, String breed, int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	public void barking() {
		System.out.println(this.name +"의 종은 "+this.breed+"의 강아지입니다.");
		System.out.println(this.color+"색이며 현재 "+this.age+"살입니다.");
		System.out.println("멍멍 짖는다.");
	}
	public void hungry() {		
		System.out.println(this.name +"의 종은 "+this.breed+"의 강아지입니다.");
		System.out.println(this.color+"색이며 현재 "+this.age+"살입니다.");
		System.out.println("배고파요");
	}
	public void sleeping() {
		System.out.println(this.name +"의 종은 "+this.breed+"의 강아지입니다.");
		System.out.println(this.color+"색이며 현재 "+this.age+"살입니다.");
		System.out.println(" ZZzz..");
	}
}