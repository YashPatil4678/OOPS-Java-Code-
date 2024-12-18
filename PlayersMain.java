
public class PlayersMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//General Contracts of equals
		Players p1 = new Players(1001,"Rohit Sharma","Cricket");
		Players p2 = new Players(1001,"Rohit Sharma","Cricket");
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
	}

}
