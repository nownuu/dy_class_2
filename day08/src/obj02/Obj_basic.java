package obj02;

public class Obj_basic {
	/*객체의 치환은 객체가 복사되는 것이 아니라 레퍼런스가 복사된다.
	 * 즉, ob2가 150번지라는 값을 가지고 있고, emt가 null값을 가지고 있는데
	 * ob2 = emt 를 해주면 emt에 150번지라는 레퍼런스를 가지게된다.
	 */
	
	/*
	 * Person a, b; --> a, b값은 둘다 null값
	 * a = new Person("lee"); //-> a = "lee" / b = null
	 * b = new Person("sung"); //-> a = "lee" / b = "sung"
	 * b = a; //-> a = "lee" / b = "lee" // "sung" 값은 가비지가 된다. (쓰레기 값)
	 * 
	 * 가비지 컬렉션 == System.gc();
	 * 
	 * Circle [] c; == Circle c[]; //Circle 배열에 대한 레퍼런스 변수 c 선언
	 */
}
