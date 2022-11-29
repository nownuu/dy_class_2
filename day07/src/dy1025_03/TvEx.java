package dy1025_03;

public class TvEx {
	public static void main(String[] args) {
		Tv firstTv = new Tv();
		firstTv.model = "삼성";
		firstTv.channel = 7;
		firstTv.volume = 14;
		
		firstTv.turnOff();
		
		//=============
		System.out.println();
		Tv seconTv = new Tv("LG", 21, 11);
		seconTv.channelChange();
		
		//=============
		System.out.println();
		Tv thirdTv= new Tv("동양", 212, 7);
		thirdTv.volumeUp();
	}
}
