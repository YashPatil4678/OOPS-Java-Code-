
import java.util.Scanner;
public class Areas {
	int length;
	int breadth;
	
	Areas(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
	} 
	
	 int Areas() {
		return length * breadth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of Triangle: ");
		int length = sc.nextInt();
		System.out.println("Enter Breadth of Triangle: ");
		int breadth = sc.nextInt();
		
		Areas a1 = new Areas(length,breadth);
		System.out.println("Area of Triangle: "+a1.Areas());
		

	}

}
