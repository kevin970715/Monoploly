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
    
    public boolean logIn(String name) throws RemoteException;
    public boolean logOut(String name) throws RemoteException;
    public boolean startGame() throws RemoteException;
    public void raffleTheServe(String name, int face1, int face2) throws RemoteException;
    public void notification() throws RemoteException;
    public int tosseDice() throws RemoteException;
    public String buyHouse(String name,String nameProperty) throws RemoteException;
    public String buyProperty(String name,String nameProperty) throws RemoteException;
    public Player getCurrentPlayer() throws RemoteException;
    public ArrayList<Player> getPlayers() throws RemoteException;
    public void brokeOut(String name) throws RemoteException;
    public String auction(String name,String nameProperty) throws RemoteException;
    public String morgage(String name,String nameProperty) throws RemoteException;
    public String removeMorgage(String name,String nameProperty) throws RemoteException;
    
}
