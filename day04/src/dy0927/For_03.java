package dy0927;

public class For_03 {
	public static void main(String[] args) {
		//1부터 1000까지 홀수의 합 / 짝수의 합을 구하시오
		int osum = 0, esum=0;
		
		for(int i = 0; i<=1000; i++) {
			
			if(i%2==0) {
				esum+=i;
			} else {
				osum +=i;
			}
		}
		System.out.println("짝수의 합 : " + esum);
		System.out.println("홀수의 합 : " + osum);
	}
}
