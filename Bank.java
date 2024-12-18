
public class Bank {
	String name;
	String branch;
	String accname;
	int accno;
	int ifsc;
	String acctype;
	float accbal;
	
	public void setData() {
		name = "Bank Of Maharashtra";
		branch = "Shivajinagar";
		accname = "Yash Patil";
		accno = 602348489;
		ifsc = 1042;
		acctype = "Saving";
		accbal = 50000;	
	}
	public void setAcctype(String s) {
		acctype = s;
	}
	
	public String getAcctype() {
		return acctype;
	}
	
	public void showData() {
		System.out.println("Bank Name:" +name);
		System.out.println("Branch Name:" +branch);
		System.out.println("Account Holder Name:" +accname);
		System.out.println("Account No:" +accno);
		System.out.println("Branch IFSC:" +ifsc);
		System.out.println("Account Type:" +acctype);
		System.out.println("Balance:" +accbal);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1 = new Bank();
		b1.setData();
		b1.showData();
		b1.setAcctype("Current");
		System.out.println("Account Type:" +b1.getAcctype());
	}

}
