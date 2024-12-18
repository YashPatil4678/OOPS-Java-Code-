
public class Animal {
	// Field or attributes or properties
	String type;
	String name;
	String color;
	//methods
	public void setData () {
		type="Wild";
		name="Tiger";
		color="White";
	}
	//Setter
	public void setColor(String c) {
		color=c;
	}
	//Getter
	public String getColor() {
		return color;
	}
	public void showData() {
		System.out.println("Animal Type:" +type);
		System.out.println("Animal Name:" +name);
		System.out.println("Animal Color:" +color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To create object
		//ClassName objectname = new ClassName();
		Animal a1 = new Animal();
		//To call any method, we must create object
		//object.methodname()
		a1.setData();
		a1.showData();
		a1.setColor("Brown");
		System.out.println("Animal color:" +a1.getColor());

	}

}
