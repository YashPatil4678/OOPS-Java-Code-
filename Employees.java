
public class Employees {
	String name;
	int yearOfjoining;
	String address;
	
	
	Employees(String name, int yearOfjoining, String address){
		this.name = name;
		this.yearOfjoining = yearOfjoining;
		this.address = address;
		
	}
	
	public String toString() {
		return name+" "+yearOfjoining+" "+address+" ";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees e1 = new Employees("Robert", 1994, "64C- WallsStreat");
		Employees e2 = new Employees("Sam", 2000, "64C- WallsStreat");
		Employees e3 = new Employees("John", 1999, "64C- WallsStreat");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}

}
