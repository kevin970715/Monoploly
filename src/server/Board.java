package server;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Random;

public class Board {
	int currentTurn;
	int totalPlayer;
        Die die;
	ArrayList<Player> players;
	ArrayList<Square> squares;
	String[] names = new String[] { "House", "Villa", "Town", "City", "Peace", "Village", "Jade", "Soi 4", "White", "Dark" };
        
	public Board() {
            	currentTurn = 0;
                totalPlayer = 0;
                die = new Die();
		players = new ArrayList<>();
                squares = new ArrayList<>();
		Random rand = new Random();
		for(int i = 0;i < squares.size();i++){
                    switch (i) {
                        case 0:
                            squares.add(i,new GoSquare("GO"));
                            break;
                        case 9:
                            squares.add(i,new JailSquare("Jail"));
                            break;
                        case 19:
                            squares.add(i,new VacationSquare("Vacation"));
                            break;
                        case 29:
                            squares.add(i,new GoToJailSquare("Go to Jail"));
                            break;
                        default:
                            squares.add(i,new PropertieSquare(names[rand.nextInt(names.length)] + " " + names[rand.nextInt(names.length)], 400 + rand.nextInt(300)));
                            break;
                    }
		}
	}
        public boolean logIn(String name) throws RemoteException {
            boolean creado=false;
            if(players.size()<8){
                for(int i=0; i<players.size(); i++)
                    if(players.get(i).getName().equals(name))
                        return creado;
            
            players.add(new Player(name));
            for(int i=0; i<players.size(); i++)//Se recorre a todos los usuarios
                if(!players.get(i).getName().equals(name))
                    players.get(i).addMessage(name+" inició sesión");//Se le deja el mensaje del remitente
            creado=true;
        } 
        return creado;
    }
	public Square movePlayer(Player player, int face) {
		return movePlayer(player, face, true);
	}
	
	public Square movePlayer(Player player, int face, boolean count) {
		if(player.isBrokeOut()){ return squares[player.getCurrentPosition()]; }
		int newPosition = normalizePosition(player.getCurrentPosition() + face);
		player.setPosition(newPosition);
		Util.print(player, player.getName() + " goes to " + squares[player.getCurrentPosition()].getName());
		squares[newPosition].doAction(player, this);
		if(player.getMoney().isBrokeOut()){
			Util.print(player, player.getName() + " has been broke out!");
			player.setBrokeOut(true);
		}else{
			if(count){
				player.nextTurn();
			}
		}
		return squares[newPosition];
	}
	
	public boolean hasWinner() {
		int ingame = 0;
		for(Player player:players){
			if(!player.isBrokeOut()){
				ingame++;
			}
		}
		return ingame <= 1;
	}
	
	public Player getWinner() {
		if(!hasWinner()){ return null; }
		for(Player player:players){
			if(!player.isBrokeOut()){ return player; }
		}
		return null;
	}
	
	public Player getMaxMoneyPlayer() {
		Player maxplayer = null;
		for(Player player:players){
			if(maxplayer == null || maxplayer.getMoney().getMoney() < player.getMoney().getMoney()){
				maxplayer = player;
			}
		}
		return maxplayer;
	}
	
	public int normalizePosition(int position) {
		return position % squares.length;
	}
	
	public Player getCurrentPlayer() {
		return players.get(currentTurn);
	}
	
	public ArrayList<Player> getPlayers() {
		return players;
	}
	
	public void nextTurn() {
		if(++currentTurn >= players.size())
			currentTurn = 0;
	}
	
	public Player getPlayer(String name) {
		return players.get(indexPlayer(name));
	}
	
	public int getTotalSquare() {
		return squares.size();
	}
        
        public String buyHouse(String namePlayer,String namePropertie) {
                String response;
                Player player=players.get(indexPlayer(namePlayer));
                namePlayer.equals(squares.get(player.getCurrentPosition()));
                if(player.getProperties().contains(namePropertie)){//si es mi propiedad
                    if(player.getMoney().getMoney()>=player.getProperties().indexOf()){
                    }
                }else
                    response="No puedes comprar en esta propiedad (no es tuya)";
                hs.doAction(players.get(index(namePlayer)), this);
        }
        
        public int indexPlayer(String name) {
            int i;
            for (i = 0; i < players.size(); i++)
                if (name.equals(players.get(i).getName()))
                    break;
            return i;
        }
}
