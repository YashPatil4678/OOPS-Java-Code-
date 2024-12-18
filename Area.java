import java.util.Scanner;
public class Area {

	double length;
	double breadth;

	void setDim(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	double getArea() {
		return length*breadth; 
	}
	
	public static void main(String[] args) {
		Area a1 = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of Reactangle : ");
		double length = sc.nextDouble();
		System.out.println("Enter the Breadth of Rectangle :");
		double breadth =sc.nextDouble();
		
		a1.setDim(length, breadth);
		double area = a1.getArea();
		System.out.println("Area of rectangle:" +area);
		
		
	}
}
