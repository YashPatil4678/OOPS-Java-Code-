
public class Book {
	String title;
	String author;
	double price;
	int stock;
	
	public void setData() {
		title="ABC";
		author="xyz";
		price=123.45;
		stock=110;
	
	}
	public void showData() {
		System.out.println("Book tile:" +title);
		System.out.println("Book author:"+author);
		System.out.println("Book price:"+price);
		System.out.println("Book stock:"+stock);
	}
	
	public static void main(String [] args) {
		Book b1 = new Book();
		b1.setData();
		b1.showData();
		
	}
}	