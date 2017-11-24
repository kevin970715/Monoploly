package server;
import java.io.Serializable;

public class Die implements Serializable{

	public int getFace() {
		int face=(int)(Math.random()*6)+1;
		return face;
	}
}
