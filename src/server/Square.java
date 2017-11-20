package server;
public abstract class Square {
	String name;
	
	public Square(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract String doAction(Player player, String action);
}
