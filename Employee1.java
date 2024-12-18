
public class Employee1 {
	String name;
	double salary;
	
	public void setData(String name,double salary) {
		this.name = name;
		this.salary = salary;
	}
	public void showData() {
		System.out.println("Enter name of Employee:" +name);
		System.out.println("Enter salary :"+salary);
	
	
	}
	
	public Employee1(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public double calculateBonus() {
		return 0.1*salary;
	}
}
