
public class Books {
	String bookname;
	String type;
	String author;
	float price;
	
	//method with the same name as the class name
	//called as constructor
	//constructor constructs the object
	//constructor does not return any value not even void
	//constructor is called automatically when a new object is created
	//There are 2 types of constructors
	Books(){
		bookname="xyz";
		type = "ABC";
		author = "qws";
		price = 78;
			
	}
	Books(String bookname,String type,String author,float price){
		this.bookname= bookname;
		this.type= type;
		this.author=author;
		this.price=price;
	}
	@Override
	public String toString() {
		return bookname+" "+type+" "+author+" "+price;
	}
	

}
