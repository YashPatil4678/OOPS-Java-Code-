
public class Employee {
	String name;
	int id;
	String designation;
	String address;
	
	public void setData(){
		name = "Yash";
		id = 4678;
		designation = "Software Developer";
		address = "Pune";
	}
	
	public void setName(String s) {
		name = s;
	}
	
	public String getName() {
		return name;
	}
	public void showData(){
		System.out.println("Employee Name :" +name);
		System.out.println("Employee Id :"+id);
		System.out.println("Employee Designation :"+designation);
		System.out.println("Employee Add :"+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setData();
		e1.showData();
		e1.setName("Piyush");
		System.out.println("Employee Name:"+e1.getName());
	
	
	}

}
