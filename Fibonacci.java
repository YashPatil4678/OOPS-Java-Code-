import java.util.Scanner;
public class Fibonacci {
	public void show(int limit) {
		int a = 0;
		int b = 1;
		int c;
		
		System.out.print(a+" "+b);
		for(int i = 1;i<=limit;i++) {
			c = a + b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of fibonacci series:");
		int limit = sc.nextInt();
		Fibonacci f1 = new Fibonacci();
		f1.show(limit);

	}

}
