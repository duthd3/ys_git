class Data4 {
	int x;
}
public class ReferenceReturnEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data4 d = new Data4();
		d.x = 10;
		
		Data4 d2 = copy(d);
		System.out.println("d.x =" + d.x);
		System.out.println("d2.x =" + d2.x);

	}
	
	static Data4 copy(Data4 d) {
		Data4 tmp = new Data4();
		tmp.x = d.x;
		
		return tmp; //��ü�� �ּҰ� ��ȯ
	}

}
