
public class Student {
	private String name;
	private int id;
	private double grade;
	
	Student(String name,int id){
		this.id =id;
		this.name=name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		if (grade >=0 && grade <=100) {
		this.grade = grade;
		}
	}
	public void displayDetails() {
		System.out.println("ID :" +id);
		System.out.println("Name: "+name);
		System.out.println("Grade :" +grade);
	}
}

