package server;
import interfaces.MonopolyInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Board extends UnicastRemoteObject implements MonopolyInterface{
        int currentTurn;
        Die die;
        ArrayList<Player> players;
        ArrayList<Square> squares;
        ArrayList<String> possiblesNames;
        ArrayList<String> verifyDoubles;
        boolean gameInit=false;
        
        public Board() throws RemoteException{
            currentTurn = 0;
            die = new Die();
            players = new ArrayList<>();
            squares = new ArrayList<>();
            verifyDoubles=new ArrayList<>();
            possiblesNames=new ArrayList<>();
            possiblesNames.add("Select one");
            possiblesNames.add("Carretilla");
            possiblesNames.add("Buque de guerra");
            possiblesNames.add("Vehiculo");
            possiblesNames.add("Dedal");
            possiblesNames.add("Zapato antiguo");
            possiblesNames.add("Perro terrier");
            possiblesNames.add("Sombrero de copa");
            possiblesNames.add("Plancha");
        }
        
        @Override
        public ArrayList<String> getPossiblesNames() throws RemoteException{
            return possiblesNames;
        }
        
        @Override
        public void removePossiblesNames(String name) throws RemoteException{
            int i;
            for(i=0; i<possiblesNames.size(); i++)
                if(possiblesNames.get(i).equals(name))
                    break;
            possiblesNames.remove(i);
        }
        
        @Override
        public boolean logIn(String name) throws RemoteException {
            boolean creado=false;
            if(players.size()<4){
                for (Player player : players) 
                    if (player.getName().equals(name))
                        return creado;
                players.add(new Player(name));
                messageAllPlayer(name,name+" inició sesión");
                creado=true;
            } 
            return creado;
        }
        
        @Override
        public boolean logOut(String name) throws RemoteException {
            boolean result=false;
            int index=-1;
            //Se busca el usuario por el nombre
            for(int i=0; i<players.size(); i++){
                if(players.get(i).getName().equals(name)){
                    index=i;
                    break;
                }
            }

            if (index > -1){//Si existe usuario a eliminar
                messageAllPlayer(name, name +" ha abandonado el juego");
                players.remove(index);
                if (index==players.size()-1)
                    currentTurn=index-1;
                else
                    currentTurn=index;
                result=true;
            }
            return result;
        }
        
        @Override
        public boolean startGame() throws RemoteException {
            if(players.size()<2){
                players.get(0).addMessage("No hay suficicientes jugadores para iniciar");
                return false;
            }
            squares.add(new Square("GO"));
            squares.add(new Square("San luis norte",60,"brown",2,10,30,90,160,250,30,50));
            squares.add(new Square("Community chest"));
            squares.add(new Square("San luis sur",60,"brown",4,20,60,180,320,450,30,50));
            squares.add(new Square("Income task"));
            squares.add(new Square("Tren del sur",200,25,100));
            squares.add(new Square("Formosa este",100,"light blue",6,30,90,270,400,550,50,50));
            squares.add(new Square("Chance"));
            squares.add(new Square("Formosa norte",100,"light blue",6,30,90,270,400,550,50,50));
            squares.add(new Square("Formosa sur",120,"light blue",8,40,100,300,450,600,60,50));
            squares.add(new Square("Jail"));
            squares.add(new Square("San juan sur",140,"purple",10,50,150,450,625,750,70,100));
            squares.add(new Square("Chance"));
            squares.add(new Square("San juan este",140,"purple",10,50,150,450,625,750,70,100));
            squares.add(new Square("San juan norte",160,"purple",12,60,80,500,700,900,80,100));
            squares.add(new Square("Tren del norte",200,25,100));
            squares.add(new Square("Neuquen sur",180,"orange",14,70,200,550,750,950,90,100));
            squares.add(new Square("Community chest"));
            squares.add(new Square("Neuquen este",180,"orange",14,70,200,550,750,950,90,100));
            squares.add(new Square("Neuquen norte",200,"orange",16,80,220,600,800,1000,100,100));
            squares.add(new Square("Vacation"));
            squares.add(new Square("Mendoza este",220,"red",18,90,250,700,875,1050,110,150));
            squares.add(new Square("Chance"));
            squares.add(new Square("Mendoza sur",220,"red",18,90,250,700,875,1050,110,150));
            squares.add(new Square("Mendoza norte",240,"red",20,100,300,750,925,1100,120,150));
            squares.add(new Square("Tren del este",200,25,100));
            squares.add(new Square("Santa fe este",260,"yellow",22,110,330,800,975,1150,130,150));
            squares.add(new Square("Santa fe sur",260,"yellow",22,110,330,800,975,1150,130,150));
            squares.add(new Square("Community chest"));
            squares.add(new Square("Santa fe norte",280,"yellow",24,120,360,850,1025,1200,140,150));
            squares.add(new Square("Go to Jail"));
            squares.add(new Square("Cordoba este",300,"green",26,130,390,900,1100,1275,150,200));
            squares.add(new Square("Cordoba sur",300,"green",26,130,390,900,1100,1275,150,200));
            squares.add(new Square("Community chest"));
            squares.add(new Square("Cordoba norte",320,"green",28,150,450,1000,1200,1400,160,200));
            squares.add(new Square("Tren del oeste",200,25,100));
            squares.add(new Square("Chance"));
            squares.add(new Square("Buenos aires norte",350,"blue",35,175,500,1100,1300,1500,175,200));
            squares.add(new Square("Luxury Tax"));
            squares.add(new Square("Buenos aires sur",400,"blue",50,200,600,1400,1700,2000,200,200));
            messageAllPlayer(players.get(0).getName(),"El juego a iniciado");
            return gameInit=true;   
        }

        @Override
        public int tosseDice() throws RemoteException {
            return die.getFace();
        }

        @Override
        public void buyHouse(String namePlayer,String namePropertie) throws RemoteException {
            Player player=players.get(indexPlayer(namePlayer));          
            Square selectSquare=squares.get(player.getCurrentPosition());
            String colorPropertie=selectSquare.getColor();
            ArrayList<Square> temp=new ArrayList<>();
            temp.add(selectSquare);
            if(namePlayer.equals(selectSquare.getOwner())){//si es mi propiedad
                for (int i = 0; i < squares.size(); i++){
                    if (i!=player.getCurrentPosition() && colorPropertie.equals(squares.get(i).getColor())){//no se tendrá en cuenta el square actual y si hay propiedades del mismo color
                        if (namePlayer.equals(squares.get(i).getOwner())){//se verifica que todas las propiedades del mismo color, sean del mismo jugador
                            temp.add(squares.get(i));
                        }else{
                            temp.clear();
                            player.addMessage("No puedes comprar!!. No posees el monopolio de las propiedades");
                        }
                    }
                }
                for (int i = 0; i < temp.size(); i++) {
                    int diference=selectSquare.getNumHouses()-squares.get(i).getNumHouses();
                    if (diference<-1 || diference>0)
                        player.addMessage("Casa no comprada!!, debes comprar una casa a la vez, propiedad por propiedad");
                }
                if(selectSquare.getNumHouses()<4){//si aún puedo comprar una casa más
                    if(player.getMoney().getMoney()>=selectSquare.getHousePrice()){//si tengo dinero suficiente para comprar la casa
                        player.getMoney().substractMoney(selectSquare.getHousePrice());
                        if (selectSquare.getNumHouses()<3) {
                            selectSquare.addHouse();
                            player.addMessage("Has comprado una casa");
                        }else{
                            selectSquare.setHotel(true);
                            player.addMessage("Has comprado un hotel");
                        }
                    }else
                        player.addMessage("No posee dinero suficicente para comprar la casa");
                }else
                    player.addMessage("Limite de casas para esta propiedad");
            }else
               player.addMessage("No puedes comprar en esta propiedad (no es tuya)");
        }
        
        @Override
        public void buyProperty(String name, String nameProperty) throws RemoteException {
            for (Square square : squares) {
                if (square.getName().equals(nameProperty)) {
                    if(!square.isHaveOwner()){
                        if(getPlayer(name).getMoney().getMoney()>=square.getPrice()){
                            getPlayer(name).getMoney().substractMoney(square.getPrice());
                            square.setOwner(name);
                            getPlayer(name).addMessage("-"+square.getPrice()+" por la propiedad");
                            messageAllPlayer(name,name+": -"+square.getPrice()+" por comprar una propiedad");
                            break;
                        }else{ 
                            getPlayer(name).addMessage("No posees dinero suficiente para comprar esta propiedad"); 
                        }
                    }else{ 
                        getPlayer(name).addMessage("La propiedad ya tiene dueño"); 
                    }
                }            
            }
        }
        
        @Override
        public String buyTrain(String name, String nameTrain) throws RemoteException{
            String data=null;
            for (Square square : squares) {
                if (square.getName().equals(nameTrain)) {
                    if(!square.isHaveOwner()){
                        if(getPlayer(name).getMoney().getMoney()>=square.getPrice()){
                            getPlayer(name).getMoney().substractMoney(square.getPrice());
                            getPlayer(name).addTren();
                            square.setOwner(name);
                            data= "-"+square.getPrice()+" por el tren";
                            messageAllPlayer(name,": -"+square.getPrice()+" por comprar un tren");
                            break;
                        }else{ data="No posees dinero suficiente para comprar el tren"; }
                    }else{ data="El tren ya tiene dueño"; }
                }
            }
            return data;
        }
        
        @Override
	public Player getCurrentPlayer() throws RemoteException {
            return players.get(currentTurn);
	}

        @Override
	public ArrayList<Player> getPlayers() throws RemoteException{
            return players;
	} 

        @Override
        public void morgage(String name, String nameProperty, boolean property) throws RemoteException {
            for (Square square : squares) {
                if (square.getName().equals(nameProperty)) {//se busca la propiedad
                    if (square.getOwner().equals(name) && !square.isMortgaged()) {//cuando se encuentre, se pregunta si es el dueño
                        if (property){
                            int charge=square.getMortgage()+square.getHousePrice()*square.getNumHouses();
                            getPlayer(name).getMoney().addMoney(charge); 
                            getPlayer(name).addMessage("Has hipotecado la propiedad por "+charge+" monedas");
                             messageAllPlayer(name,name+ " Ha hipotecado una propiedad por "+charge+" monedas");
                        }else{
                            getPlayer(name).getMoney().addMoney(square.getMortgage());
                            getPlayer(name).addMessage("Has hipotecado el tren por "+square.getMortgage()+" monedas");
                            messageAllPlayer(name,name+" Ha hipotecado un tren por "+square.getMortgage()+" monedas");
                        }
                        square.setMortgaged(true);
                        break;
                    }else{
                        getPlayer(name).addMessage("Esta no es tu propiedad o ya ha sido hipotecada");
                    }
                }
            }
        }

        @Override
        public void removeMorgage(String name, String nameProperty, boolean property) throws RemoteException {
            for (Square square : squares) {
                if (square.getName().equals(nameProperty)) {//se busca la propiedad
                    if (square.getOwner().equals(name) && square.isMortgaged()) {//cuando se encuentre, se pregunta si es el dueño
                        if (property){
                            int charge=square.getMortgage()+square.getHousePrice()*square.getNumHouses();
                            getPlayer(name).getMoney().substractMoney((int)(charge*1.1));
                            getPlayer(name).addMessage("Se ha quitado la hipoteca de la propiedad");
                            messageAllPlayer(name,name+" Ha quitado la hipoteca de la propiedad");
                        }else{
                            getPlayer(name).getMoney().addMoney((int)(square.getMortgage()*1.1));
                            getPlayer(name).addMessage("Se ha quitado la hipoteca del tren");
                            messageAllPlayer(name,name+" Ha quitado la hipoteca del tren");
                        }
                        square.setMortgaged(false);
                        break;
                    }else{
                        getPlayer(name).addMessage("Esta no es tu propiedad");
                    }
                }
            } 
        }
        
        @Override
        public String getMessage(String name) throws RemoteException{
            int index=-1;
            String msg = null;
            //Se busca el usuario por el nombre
            for(int i=0; i<players.size(); i++)
                if(players.get(i).getName().equals(name))
                    index=i;

            if (index > -1)
                msg=players.get(index).getMessage();

            return msg;
        }
        
        @Override
		public String getTurn() throws RemoteException{
            return players.get(currentTurn).getName();
        }
        
        @Override
        public int movePlayer(String name, int face1, int face2) throws RemoteException{
            int result=0;
            if (gameInit){//si el juego inició
                if (players.get(currentTurn).getName().equals(name))//si es mi turno 
                    result=move(players.get(currentTurn), face1, face2);//se llama a mePlayer para mover y que devuelva la nueva posición
                else
                    getPlayer(name).addMessage("No es tu turno aun");
            }else{ getPlayer(name).addMessage("El juego no ha iniciado aún"); }
            return result;
        }

        public int move(Player player, int face1,int face2) {
            int face=face1+face2, newPosition=player.getCurrentPosition();
            if(player.isBrokeOut()){ return player.getCurrentPosition(); }
            if(face1==face2){//desde aquí
                verifyDoubles.add(player.getName());
                if(verifyDoubles.size()==3){
                    squares.get(newPosition).goToJailAction(player, this);              
                    verifyDoubles.clear();
                    nextTurn();
                    return player.getCurrentPosition();
                }
            }else if(!verifyDoubles.isEmpty()){ verifyDoubles.clear();}//hasta aquí, se verifica que hallan salido los tres dobles seguidos y se manda al jugador a la cárcel
            
            if(player.isInJail()){
                if (face1==face2){ 
                    squares.get(newPosition).jailAction1(player, this);
                    nextTurn();
                }else{
                    player.addAttempts();
                    if (player.getAttempts()==3){
                        squares.get(newPosition).jailAction2(player, this);
                        player.addMessage("Has intentado salir de la cárcel tres veces y no lo has logrado, estás libre: -50 monedas");
                        newPosition = normalizePosition(player.getCurrentPosition() + face);
                        action(player,face1,face2,newPosition);//se hace antes de ajustar la nueva posición para saber si pasa por go y darle 200
                        player.setCurrentPosition(newPosition);
                    }
                }                    
            }else{
                newPosition = normalizePosition(player.getCurrentPosition() + face);
                action(player,face1,face2,newPosition);//se hace antes de ajustar la nueva posición para saber si pasa por go y darle 200
                player.setCurrentPosition(newPosition);
            }
            
            if(player.getMoney().isBrokeOut()){
                messageAllPlayer(player.getName(),player.getName() + " ha quedado en bancarrota!");
                for (Square square : squares)
                    if (square.getOwner().equals(player.getName()))
                        square.reset();
                player.setBrokeOut(true);
            }
            if (face1!=face2){ nextTurn(); }
            return newPosition;
	}
	
        public int action(Player player,int face1,int face2,int newPosition){
            Square square=squares.get(newPosition);
            Player owner=null;
            if ((player.getCurrentPosition() + face1+face2)>40) {
                player.getMoney().addMoney(200);
                player.addMessage("+200 monedas por pasar por go");
            }
            if(square.isHaveOwner())
                owner=players.get(indexPlayer(square.getOwner()));
            
            switch(newPosition){
                case 0:
                    square.goAction(player, this);
                    break;
                case 2: case 17: case 28: case 33:
                    square.communityChestAction(player, this);
                    break;
                case 4:
                    square.incomeTask(player, this);
                    break;
                case 5: case 15: case 25: case 35:
                    if(square.isHaveOwner() && !square.isMortgaged()){
                        int hire=owner.getNumTrenes()*square.getChargePriceTrain();
                        square.collectRentTrain(player,owner,this,hire);
                    }
                    break;
                case 7: case 12: case 22: case 36:
                    square.chance(player, this);
                    break;
                case 10: case 20:
                    break;
                case 30:
                    newPosition=square.goToJailAction(player, this);
                    break;
                case 38:
                    square.luxuryTax(player, this);
                    break;
                default:
                    if (square.isHaveOwner() && !square.isMortgaged()){
                        int hire=square.getChargePriceProperty();
                        square.collectRentProperty(player,owner,this,hire);
                    }
                    break;
            }
            return newPosition;
        }
        
        @Override
	public Player getPlayer(String name) throws RemoteException{
            return players.get(indexPlayer(name));
	}
        
        @Override
        public Square getSquare(int i) throws RemoteException{
            return squares.get(i);
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
            return position % squares.size();
	}
	
	public void nextTurn() {
            if(++currentTurn >= players.size())
                currentTurn = 0;
	}
	
	public int getTotalSquare() {
            return squares.size();
	}
        
        public int indexPlayer(String name) {
            int index=-1;
            for (int i = 0; i < players.size(); i++){
                if (name.equals(players.get(i).getName())){
                    index=i;
                    break;
                }
            }
            return index;
        }
        
        public void messageAllPlayer(String name,String message){
            for(int i=0; i<players.size(); i++)//Se recorre a todos los usuarios
                if(!players.get(i).getName().equals(name))
                    players.get(i).addMessage(message);//Se le deja el mensaje del remitente
        }
        
        public static void main(String[] args) {
        
        }
}
