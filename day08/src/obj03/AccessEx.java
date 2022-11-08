package obj03;

/*
 * 자바의 접근 지정자 4가지
 *  * 객체 지향 언어의 캡슐화 정책
 * public | protected | 디폴트(접근 지정자 생략) | private
 * 모든 클래스 | 동일 패키지&자식패키지 | 동일 패키지 | 외부로 완벽 차단
 * --
 * 클래스나 일부 멤버를 공개하여 다른 클래스에서 접근하도록 허용
 * 
 * class가 두 개인 경우 main이 들어가는 클래스로 파일명을 지정해준다.
 * */

class Sample{ //public 이 두개 가 있으면 error!
	public int a;
	private int b;
	int c; // 디폴트
	protected int d;
	
	public Sample() {}
	public Sample(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
}
public class AccessEx {
	public static void main(String[] args) {
		Sample aObj = new Sample();
		aObj.a = 10;
//		aObj.b = 10; private Error!
		aObj.c = 10;
		aObj.d = 10; // 동일 패키지라서 가능
	}
}
