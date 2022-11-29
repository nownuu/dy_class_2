package inheritance03;

public class MagaEx {
	public static void main(String[] args) {
		
		Magazine mg1 = new Magazine("소나기", 120, "황순원", "7일");
		mg1.printMagazine();
		
		Magazine mg2 = new Magazine("드림페", 1017, "스티벌", "10일");
		mg2.printMagazine();
	}
}
