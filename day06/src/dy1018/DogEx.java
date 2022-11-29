package dy1018;

public class DogEx {
	public static void main(String[] args) {
		Dog mata = new Dog();
		
		mata.name = "마타타";
		mata.breed="말티즈";
		mata.age=5;
		mata.color="화이트";
		
		mata.barking();
		mata.hungry();
		mata.sleeping();
		System.out.println(mata.name+" "+mata.breed+" "+mata.age+" "+mata.color);

		
		/*======== */
		Dog haku = new Dog();
		
		haku.name = "하타타";
		haku.breed="말티푸";
		haku.age=2;
		haku.color="브라운";
		
		System.out.println(haku.name+" "+haku.breed+" "+haku.age+" "+haku.color);
		
		/*======== */
		Dog sam = new Dog();
		
		sam.name = "삼식이";
		sam.breed="말티즈";
		sam.age=2;
		sam.color="화이트";
		
		System.out.println(sam.name+" "+sam.breed+" "+sam.age+" "+sam.color);

	}
}
