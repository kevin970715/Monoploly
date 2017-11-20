package server;

import java.util.ArrayList;

public class Player {
	int totalWalk = 0;
	int position = 0;
	String name;
	boolean brokeout = false;
	private final Money money;
        private final ArrayList<String> messages;
        
	public Player(String name){
		this.name = name;
                this.money = new Money(1500);   
                this.messages=new ArrayList<>();       
	}
        
	public int getTotalWalk() {
		return totalWalk;
	}
	
	public int tossDie(Die die) {
		return die.getFace();
	}
	
	public int getCurrentPosition() {
		return position;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
	public void nextTurn() {
		totalWalk++;
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
}
