package obj01;

public class BookEx {
	public static void main(String[] args) {
		// Book�̶�� ���赵�� �̿��ؼ� ����ϴ� ��ü
		
		Book littlePrince = new Book("littlePrince", "�����㺣��");
		Book loveStory = new Book("������");
		
		littlePrince.show();
		loveStory.show();
		
		Book emptyBook = new Book();
		emptyBook.show(); //null �� ���
	}
}
