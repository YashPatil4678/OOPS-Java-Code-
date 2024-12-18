import java.util.Objects;

public class Players {
	int id;
	String name;
	String game;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public Players(int id, String name, String game) {
		super();
		this.id = id;
		this.name = name;
		this.game = game;
	}
	@Override
	public String toString() {
		return "Players [id=" + id + ", name=" + name + ", game=" + game + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(game, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Players other = (Players) obj;
		return Objects.equals(game, other.game) && id == other.id && Objects.equals(name, other.name);
	}
	
}
