
public class Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z z1 = new Z();
		System.out.println(z1);
		System.out.println(z1.hashCode());
		
		Z z2 = new Z();
		System.out.println(z2);
		System.out.println(z2.hashCode());
		System.out.println(z1==z2);
		Z z3 = z2;
		System.out.println(z3==z2);
	}

}
