package test02;

public class Define {
	
	/*
	 * 2. 일반적인 TV를 나타내는 TV클래스를 작성한다. TV에는 제조사, 가격, 크기 등의 정보가 저장되어 있다.
   TV클래스를 상속받아서 SmartTV클래스를 작성하여 보자.
   SmartTV클래스에는 타입(LED, LCD, OLED등), 인터넷가능, 블루투스가능여부 등의 필드가 추가됩니다. 
   생성자, 접근자, 설정자를 포함하여서 각각의 클래스를 작성한다. 
   interface는 TvInterface를 작성하여 보자 
   void youtubePlay(); void youtubeStop(); void internetPlay(); void internetStop(); 
   SmartTV 클래스는 TvInterface를 구현한다. SmartTV 객체를 만들고 각 객체의 모든 정보를 출력하는 테스트 클래스를 작성하라. 
	 * */
	
	// 제조사
	public final static int lg = 100;
	public final static int samsung = 200;
	public final static int jong = 300;
	
	// 타입
	public final static int led = 100;
	public final static int lcd = 200;
	public final static int oled = 300;
}
