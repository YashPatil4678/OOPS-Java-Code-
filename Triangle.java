
public class Triangle {
	int a = 3;
	int b = 4;
	int c = 5;
	
	int getPerimeter() {
		return a+b+c;
	}
	double getArea() {
		double s = getPerimeter() / 2;
		return Math.sqrt(s *(s - a) * (s - b) * (s - c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle();
		System.out.println("Perimeter of Triangle :"+t1.getPerimeter());
		System.out.println("Area of Triangle :"+t1.getArea());

	}

}
