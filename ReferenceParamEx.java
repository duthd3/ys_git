class Data2{
	int x;
}
public class ReferenceParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data2 d = new Data2(); //객체 생성.
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d); //객체의 주소값 전달. d.x의 값 변경
		System.out.println("After change(d)");
		System.out.println("main() : x =" + d.x);

	}
	static void change(Data2 d) { //주소값이 복사됨.
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
