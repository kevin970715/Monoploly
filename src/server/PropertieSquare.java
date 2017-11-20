package server;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class PropertieSquare extends Square {
	int price;
	String owner = "";
	String color;
        int numHouses;
        boolean hotel;
        boolean hipotecada;
        boolean haveOwner;
        Map<String,Integer> buyPrices = new HashMap<>();
        Map<String,Integer> chargePrices = new HashMap<>();
	public PropertieSquare( String name, 
                                int price,
                                String color, 
                                int hire,
                                int hOneHouse, 
                                int hTwoHouse, 
                                int hThreeHouse,
                                int hFourHouse,
                                int withHotel,
                                int mortgage,
                                int housePrice,
                                int hotelPrice) {
		super(name);
		this.price = price;
                this.color = color;
                this.numHouses=0;
                this.hotel=false;
                this.hipotecada=false;
                this.haveOwner=false;
                this.buyPrices.put("house", housePrice);
                this.buyPrices.put("hotel", hotelPrice);
                this.chargePrices.put("hire", hire);
                this.chargePrices.put("hOneHouse", hOneHouse);
                this.chargePrices.put("hTwoHouse", hTwoHouse);
                this.chargePrices.put("hThreeHouse", hThreeHouse);
                this.chargePrices.put("hFourHouse", hFourHouse);
                this.chargePrices.put("withHotel", withHotel);
                this.chargePrices.put("mortgage", mortgage);
                
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

        public int getBuyPrice(String data) {
                return buyPrices.get(data);
        }
        
        public int getChargePrice(String data) {
                return chargePrices.get(data);
        }

        public int getNumHouses() {
            return numHouses;
        }

        public void addHouses(int numHouses) {
            this.numHouses += numHouses;
        }

        public boolean isHotel() {
            return hotel;
        }

        public void setHotel(boolean hotel) {
            this.hotel = hotel;
        }

        public boolean isHipotecada() {
            return hipotecada;
        }

        public void setHipotecada(boolean hipotecada) {
            this.hipotecada = hipotecada;
        }
        
/*        @Override
	public String doAction(Player player, String action) {//revisar esto y resolver si acá compro propiedad o casa
            String response="";
		if(owner.equals("")){//no tiene dueño
                    if(player.getMoney().getMoney()>=carta.getPrice("housePrice")){
                        owner = player.getName();
                        player.getMoney().substractMoney(price);
                    }else{
                        
                    }
		}else{
			if(!owner.equals(player.getName())){
				int lost = price * 70 / 100;
				Util.print(player, player.getName() + " lost " + lost + " money to " + board.getPlayer(owner).getName());
				player.getMoney().substractMoney(lost);
				board.getPlayer(owner).getMoney().addMoney(lost);
			}
		}
	}*/

    @Override
    public String doAction(Player player, String action) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
