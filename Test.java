
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1 = new Employee1("Yash",50000);
		Manager m1 = new Manager("Bhidu",100000,500);
		
		System.out.println(e1.name  + " Employee Bonus:" +e1.calculateBonus());
		System.out.println(m1.name + " Manager Bouns:" + m1.calculateBonus());
	}

}
