
public class MethodOverloadArea {
	public void area(float radius) {
		System.out.println("Area of circle :" +(3.14*radius*radius));
	}
	public void area(int len, int bre) {
		System.out.println("Area of rectangle :" + (len*bre));
	}
	public void area(float b, float h) {
		System.out.println("Area of triangle :" + (0.5*b*h));
	}
	public static void main(String[] args) {
		MethodOverloadArea m1 = new MethodOverloadArea();
		m1.area(10);
		m1.area(10, 20);
		m1.area(5, 4);
	}
}
