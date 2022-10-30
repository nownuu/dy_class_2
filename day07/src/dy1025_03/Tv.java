package dy1025_03;

public class Tv {
	String model;
	int channel, volume;
	
	public Tv() {}
	
	public Tv(String model, int channel, int volume) {
		this.model = model;
		this.channel = channel;
	}
	
	public void turnOn() {
		System.out.println(this.model+"의 TV 입니다.");
		System.out.println("현재 채널은 "+this.channel+"이며 볼륨은 현재 "+this.volume+"입니다.");
		System.out.println("해당 tv의 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println(this.model+"의 TV 입니다.");
		System.out.println("현재 채널은 "+this.channel+"이며 볼륨은 현재 "+this.volume+"입니다.");
		System.out.println("해당 tv의 전원을 끕니다.");
	}
	public void channelChange() {
		System.out.println(this.model+"의 TV 입니다.");
		System.out.println("현재 채널은 "+this.channel+"이며 볼륨은 현재 "+this.volume+"입니다.");
		System.out.println("해당 tv의 채널을 전환합니다.");
	}
	public void volumeUp() {
		System.out.println(this.model+"의 TV 입니다.");
		System.out.println("현재 채널은 "+this.channel+"이며 볼륨은 현재 "+this.volume+"입니다.");
		System.out.println("해당 tv의 소리를 키웁니다.");
	}
}


