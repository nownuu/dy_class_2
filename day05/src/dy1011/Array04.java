package dy1011;
/*
 * 2차원 배열
 * int arr[][] = new int[5][10];
 * int size1 = arr.length; //5
 * int size2 = arr[0].length; //10 -> 0번째 행의 열의 개수로서 10
 * int size3 = arr[1].length; //10 -> 1번째 행의 열의 개수로서 10
 * 
 * 중첩 반복
 *  = 반복문이 다른 반복문을 내포하는 구조
 * 
 * 비정방형 배열
 *  = 각 행의 열의 개수가 같은 배열 
 *  	int i [][];
 *  	i = new int[4][];
 *  	i[0] = new int [1];
 *  	i[1] = new int [2];
 *  	i[2] = new int [3];
 *   */

public class Array04 {
	public static void main(String[] args) {
		// 학년별로 1학기 2학기 성적을 저장하고 4년간 전체 평점 평균을 출력
		
		double score [][] = {
				{3.3, 3.4}, //1학년
				{3.5, 3.6}, //2학년
				{3.7, 4.0}, //3학년
				{4.1, 4.2} //4학년
		};
		
		double sum = 0;
		
		for(int y = 0; y<score.length; y++) {
			for(int term =0; term<score[y].length; term++) {
				sum += score[y][term];
					}
			}
		int n = score.length;
		int m = score[0].length;
		
		System.out.println("4년 전체 평점 평균 : "+ sum/(n*m));
	}
}
