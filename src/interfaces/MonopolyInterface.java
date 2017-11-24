package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import server.Player;

/**
 *
 * @author Flia Alcalá Castro
 */
public interface MonopolyInterface extends Remote {
    
    public ArrayList<String> getPossiblesNames() throws RemoteException;
    public void removePossiblesNames(String name) throws RemoteException; 
    public boolean logIn(String name) throws RemoteException;
    public boolean logOut(String name) throws RemoteException;
    public boolean startGame() throws RemoteException;
    public int tosseDice() throws RemoteException;
    public String buyHouse(String name,String nameProperty) throws RemoteException;
    public String buyProperty(String name,String nameProperty) throws RemoteException;
    public String buyTrain(String name,String nameTrain) throws RemoteException;
    public Player getCurrentPlayer() throws RemoteException;
    public ArrayList<Player> getPlayers() throws RemoteException;
    public String auction(String name,String nameProperty) throws RemoteException;
    public String morgage(String name,String nameProperty, boolean property) throws RemoteException;
    public String removeMorgage(String name,String nameProperty, boolean property) throws RemoteException;
    public String getMessage(String name) throws RemoteException;
    public String getTurn() throws RemoteException; 
    public int movePlayer(String name, int face1, int face2) throws RemoteException;
}
