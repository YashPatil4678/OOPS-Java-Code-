
public class MyOverload {
	//when we define same method name but different types of 
	//parameters or different number of parameters
	//it is called as method overloading
	//same thing in different forms
	//static polymorphism or compile time polymorphism
	//method overloading
	public void showMessage() {
		System.out.println("Good Afternoon");
	}
	public void showMessage(String msg) {
		System.out.println(msg);
	}
	public void showMessage(String msg, int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(msg);
		}
	}
//
	

	public static void main(String[] args) {
		MyOverload m1 =new MyOverload();
		m1.showMessage();
		m1.showMessage("Hello");
		m1.showMessage("hello", 7);
		

	}

}
