package hw02;

public class SmartTVEX {
	public static void main(String[] args) {
		SmartTV stv = new SmartTV("LG", 30000000, "40ÀÎÄ¡", "OLED", true, true);
		System.out.println(stv);
		System.out.print(stv.gettMake()+" TV ");
		stv.youtubePlay();
		stv.youtubeStop();
		stv.internetPlay();
		stv.internetStop();
	}
}
