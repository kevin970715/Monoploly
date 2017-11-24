package server;

import java.util.HashMap;
import java.util.Map;

public class Square {
	String name=null;
	String owner=null;
	int price=0;
	String color=null;
        int numHouses=0;
        boolean hotel=false;
        boolean morgage=false;
        boolean haveOwner=false;
        int housePrice;
        Map<String,Integer> chargePrices = new HashMap<>();
        
	public Square(String name) {
		this.name = name;
	}
        
        public Square(  String name, 
                        int price,
                        int hire,
                        int mortgage ) {
            this.name = name;
            this.price = price;
            this.chargePrices.put("hire", hire);
            this.chargePrices.put("mortgage", mortgage);
        }
        
        public Square(  String name, 
                        int price,
                        String color, 
                        int hire,
                        int hOneHouse, 
                        int hTwoHouse, 
                        int hThreeHouse,
                        int hFourHouse,
                        int withHotel,
                        int mortgage,
                        int housePrice ) {
		this.name = name;
                this.price = price;
                this.color = color;
                this.housePrice=housePrice;
                this.chargePrices.put("hire", hire);
                this.chargePrices.put("hOneHouse", hOneHouse);
                this.chargePrices.put("hTwoHouse", hTwoHouse);
                this.chargePrices.put("hThreeHouse", hThreeHouse);
                this.chargePrices.put("hFourHouse", hFourHouse);
                this.chargePrices.put("withHotel", withHotel);
                this.chargePrices.put("mortgage", mortgage);
                
	}
        public String getName() {
		return name;
        }
        	
	public void setOwner(String owner) {
		this.owner = owner;
	}
        
        public String getOwner(){
                return owner;
        }
        
        public boolean isHaveOwner() {
            return haveOwner;
        }

        public void setHaveOwner(boolean haveOwner) {
            this.haveOwner = haveOwner;
        }
        
	public int getPrice() {
		return price;
	}
        
        public String getColor() {
                return color;
        }

        public int getHousePrice() {
                return housePrice;
        }
        
        public int getChargePriceProperty() {
            switch (this.numHouses) {
                case 0:
                    return this.chargePrices.get("hire");
                case 1:
                    return this.chargePrices.get("hOneHouse");
                case 2:
                    return this.chargePrices.get("hTwoHouse");
                case 3:
                    return this.chargePrices.get("hThreeHouse");
                case 4:
                    return this.chargePrices.get("hFourHouse");
            }
            return this.chargePrices.get("hFourHouse");
        }
        
        public int getChargePriceTrain(){
            return chargePrices.get("hire");
        } 
        
        public int getNumHouses() {
            return numHouses;
        }

        public void addHouse() {
            this.numHouses++;
        }

        public boolean isHotel() {
            return hotel;
        }

        public void setHotel(boolean hotel) {
            this.hotel = hotel;
        }

        public boolean isMortgaged() {
            return morgage;
        }

        public void setMortgaged(boolean state) {
            this.morgage = state;
        }

        public int getMortgage(){
            return chargePrices.get("mortgage");
        }

        public void reset(){
            this.name=null;
            this.owner=null;
            this.price=0;
            this.color=null;
            this.numHouses=0;
            this.hotel=false;
            this.morgage=false;
            this.haveOwner=false;
        }
        
        public void goAction(Player player, Board board) {
            player.addMessage("+400 monedas por caer en go");
            board.messageAllPlayer(player.getName(),player.getName()+": +400 monedas");
            player.getMoney().addMoney(400);
        }
        
        public void goToJailAction(Player player, Board board) {
            player.addMessage("has ido a la cárcel");
            board.messageAllPlayer(player.getName(),player.getName()+" ha ido a la cárcel");
            player.setInJail(true);
            //board.movePlayer(player, -8, -12, false);
        }
        
        public void jailAction1(Player player, Board board){
            player.setAttempts(0);
            player.setInJail(false);
            player.addMessage("Has salido de la cárcel");
            board.messageAllPlayer(player.getName(),player.getName()+" ha salido de la cárcel");
        }
        
        public void jailAction2(Player player, Board board) {
            jailAction1(player, board);
            player.getMoney().substractMoney(50);
        }
        
	public void vacationAction(Player player, Board board) {
		//Random rand = new Random();
		//Square square = board.movePlayer(player, rand.nextInt(board.getTotalSquare()), false);
		//Util.print(player, player.getName() + " has go to vacation at " + square.getName());
	}
        
        public void communityChestAction(Player player, Board board){
            player.addMessage("Caíste en arca comunal: -200 monedas");
            board.messageAllPlayer(player.getName(),player.getName()+": -200 monedas");
            player.getMoney().substractMoney(200);
        }
        
        public void incomeTask(Player player,Board board){
            player.addMessage("Impuesto sobre la renta: -200 monedas");
            board.messageAllPlayer(player.getName(),player.getName()+": -200 monedas");
            player.getMoney().substractMoney(200);
        }
        
        public void chance(Player player,Board board){
            player.addMessage("Caíste en casualidad: +200 monedas");
            board.messageAllPlayer(player.getName(),player.getName()+": +200 monedas");
            player.getMoney().addMoney(200);
        }
        
        public void luxuryTax(Player player, Board board){
            player.addMessage("Impuesto de lujo: -100 monedas");
            board.messageAllPlayer(player.getName(),player.getName()+": -100 monedas");
            player.getMoney().substractMoney(100);
        }
        
        public void collectRentProperty(Player player, Player owner, Board board){
            int hire=this.getChargePriceProperty();
            player.getMoney().substractMoney(hire);
            player.addMessage("-"+hire+" por la renta");
            board.messageAllPlayer(player.getName(),player.getName()+": -"+hire+" por renta");
            owner.getMoney().addMoney(hire);
            owner.addMessage("+"+hire+" por renta cobrada");
        }
        
        public void collectRentTrain(Player player,Player owner,Board board){
            int hire=owner.getNumTrenes()*this.getChargePriceTrain();
            player.getMoney().substractMoney(hire);
            player.addMessage("-"+hire+" por la renta de tren");
            board.messageAllPlayer(player.getName(),player.getName()+": -"+hire+" por renta de tren");
            owner.getMoney().addMoney(hire);
            owner.addMessage("+"+hire+" por renta de tren cobrada");
        }
}
