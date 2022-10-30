package dy1025_03;

public class DogEx {
	public static void main(String[] args) {
		
		Dog cuteD = new Dog();
		cuteD.name = "쿠로미";
		cuteD.breed = "말티즈";
		cuteD.age = 5;
		cuteD.color ="흰색";
		
		cuteD.barking();
		
		//=====================
		System.out.println();
		Dog preD = new Dog("마이멜로디", "푸들", 7, "갈색");
		preD.hungry();
	}
}
