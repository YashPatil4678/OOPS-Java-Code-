
public class MainFood {
	public static void test(Food f1) {
		f1.prepare();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maggie m1 =new Maggie();
		Sandwich s1 = new Sandwich();
		test(m1);
		test(s1);
	}

}
