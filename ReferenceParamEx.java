class Data2{
	int x;
}
public class ReferenceParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data2 d = new Data2(); //��ü ����.
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d); //��ü�� �ּҰ� ����. d.x�� �� ����
		System.out.println("After change(d)");
		System.out.println("main() : x =" + d.x);

	}
	static void change(Data2 d) { //�ּҰ��� �����.
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
