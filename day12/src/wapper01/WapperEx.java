package wapper01;

public class WapperEx {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Integer itg = new Integer(10);
		System.out.println(itg);
		
		// static MAX_VALUE  >>  상수
		// static MIN_VALUE  >>  상수
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		Integer itgs = new Integer("sleep");
		System.out.println(itgs);
		
		System.out.println(Integer.max(10, 50));
		System.out.println(Integer.min(100, 60));
	}
}
