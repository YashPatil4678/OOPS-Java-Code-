
public class Manager extends Employee1{
	double bonus;
	
	public Manager(String name, double salary, double bonus) {
		super(name,salary);
		this.bonus = bonus;
		
	}

	
	public double calculateBonus() {
		return (0.2 * salary) + bonus ;
		
	}
	

}
