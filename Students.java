
public class Students {
	String name;
	int roll_no;
	
	public void setData(){
		name = "John";
		roll_no = 2;
	}
	
	public void showData() {
		System.out.println("Stdent Name : "+name);
		System.out.println("Roll No.: "+roll_no);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students();
		s1.setData();
		s1.showData();

	}

}
