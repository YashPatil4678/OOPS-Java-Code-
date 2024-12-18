
public class Player {
	String name;
	String game;
	String league;
	int score;
	int sixes,fours;
	
	public void setData() {
		name = "Virat Kohli";
		game = "Cricket";
		league = "IPL";
		score = 741;
		sixes = 38;
		fours = 62;
	}
	
	public void showData() {
		System.out.println("Player Name:" +name);
		System.out.println("Game:" +game);
		System.out.println("League:" +league);
		System.out.println("Score Runs in IPL 2024:" +score);
		System.out.println("Sixes in IPL 2024:" +sixes);
		System.out.println("Fours in IPL 2024:" +fours);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 =new Player();
		p1.setData();
		p1.showData();
	}

}
