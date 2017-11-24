package server;

import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable{
	int attempts = 0;
        int raffle=0;
	int position = 0;
	boolean brokeout = false;
        boolean inJail=false;
        int numTrenes=0;
        String name;
	private final Money money;
        private final ArrayList<String> messages;
                
	public Player(String name){
		this.name = name;
                this.money = new Money(1500);   
                this.messages=new ArrayList<>();       
	}
        
	public int getAttempts() {
		return attempts;
        }
        
	public void addAttempts() {
		attempts++;
	}
        
	public void setAttempts(int n) {
		this.attempts=n;
	}
        
	public int getCurrentPosition() {
		return position;
	}
	
	public void setCurrentPosition(int position) {
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	
	public Money getMoney() {
		return money;
	}
	
	public void setBrokeOut(boolean brokeout) {
		this.brokeout = brokeout;
	}
	
	public boolean isBrokeOut() {
		return brokeout;
	}
        
        public String getMessage() {
            String mensaje = "";
            if (messages != null){
                if(messages.size() > 0){
                    mensaje = messages.get(0);
                    messages.remove(0);
                }
            }
            return mensaje;
        }
    
        public void addMessage(String message) {
            messages.add(message);
        } 
        
        public int getNumTrenes(){
            return numTrenes;
        }
        
        public void addTren(){
            this.numTrenes++;
        }
        
        public int getRaffle(){
            return raffle;
        }
        
        public void setRaffle(int face1,int face2){
            this.raffle=face1+face2;
        }

        public boolean isInJail() {
            return inJail;
        }

        public void setInJail(boolean inJail) {
            this.inJail = inJail;
        }  
        
}
