package server;

import java.util.HashMap;
import java.util.Map;

public abstract class Square {
	String name;
	String owner;
	int price;
	String color;
        int numHouses;
        boolean hotel;
        boolean hipotecada;
        boolean haveOwner;
        int housePrice;
        Map<String,Integer> chargePrices = new HashMap<>();
        
	public Square(String name) {
		this.name = name;
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
		
                this.price = price;
                this.color = color;
                this.numHouses=0;
                this.hotel=false;
                this.hipotecada=false;
                this.haveOwner=false;
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
        
        public int getChargePrice(String data) {
                return chargePrices.get(data);
        }

        public int getNumHouses() {
            return numHouses;
        }

        public void addHouse() {
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
        
        public abstract void doAction(Player player, Board board);
}
