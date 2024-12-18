import java.util.Scanner;
public class Average{
	int num1,num2,num3;
	
	Average(int num1, int num2, int num3){
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	} 
	
	 double Averagenum() {
		return (num1 + num2 + num3)/ 3;
	}
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Number 1: ");
			int num1 = sc.nextInt();
			System.out.println("Number 2: ");
			int num2 = sc.nextInt();
			System.out.println("Number 3: ");
			int num3 = sc.nextInt();
			
			Average a1 = new Average(num1,num2,num3);
			System.out.println("Average of no: "+a1.Averagenum());
			

		}

}
