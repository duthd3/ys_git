
public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Card.width = " + Card.width); //cv는 객체생성 없이 사용 가능!
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card(); //객체생성
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number
				+ "이며, 크기는 ("+ c1.width + "," + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number
				+ "이며, 크기는 ("+ c2.width + "," + c2.height +")");
		System.out.println("c1의 width와 height를 각가 50, 80으로 변경 합니다.");
		Card.width = 50;
		Card.height = 80;
		System.out.println("c1은 " + c1.kind + ", " + c1.number
				+ "이며, 크기는 ("+ c1.width + "," + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number
				+ "이며, 크기는 ("+ c2.width + "," + c2.height +")");
		
		
	}

}
class Card {
	String kind;
	int number;
	
	static int width = 100;
	static int height = 250;
}
