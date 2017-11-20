package server;
public class GoSquare extends Square {
	public GoSquare(String name) {
		super(name);
	}
	
	public void doAction(Player player, String action) {
		Util.print(player, player.getName() + " is at Go... Giving 1000 money");
		player.getMoney().addMoney(1000);
	}
}
