package dy1206;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Student> stList = new ArrayList<Student>();
		Student st1 = new Student("홍길동",	"경기도 광명시", "010-9988-2911", 2022, "컴소");
		Student st2 = new Student("윤산하",	"서울특별시", "010-9788-2911", 2022, "전자");
		Student st3 = new Student("전소연",	"광주광역시", "010-1234-2911", 2020, "컴소");
		
		stList.add(st1);
		stList.add(st2);
		stList.add(st3);
		
		for(int i = 0; i<stList.size(); i++) {
			Student st = stList.get(i);
			System.out.println(st.getName()+ " "+ st.getAddr());
//			System.out.println(stList.get(i).getName() + " "+ stList.get(i).getAddr());
		}
		
		System.out.println();
		// st 중에서 서울에 사는 학생의 이름과 전화번호를 출력
		for(int i = 0; i<stList.size(); i++) {
			Student st = stList.get(i);
			if(st.getAddr() .equals("서울특별시")) {
				System.out.println(st.getName()+ " "+ st.getPhone());
			}
		}
		
		System.out.println();
		
		// st 중에서 전공이 컴소인 학생의 이름과 전화번호 출력
		for(int i = 0; i<stList.size(); i++) {
			Student st = stList.get(i);
			if(st.getJeongong().equals("컴소")) {
				System.out.println(st.getName()+ " "+ st.getPhone());
			}
		}
	}
}
