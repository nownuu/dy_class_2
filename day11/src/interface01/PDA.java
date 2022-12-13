package interface01;

public class PDA {
	public int calculate(int x, int y) {
		return x+y;
	}
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("따르릉 따르릉 ~~");
	}
	
	@Override
	public void reviceCall() {
		// TODO Auto-generated method stub
	System.out.println("전화 왔어요");	
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("음악 연주합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("음악 중단합니다.");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자갑니다.");
	}

	@Override
	public void reviceSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자왔어요.");
	}
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}