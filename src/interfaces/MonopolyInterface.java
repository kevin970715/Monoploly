package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Flia Alcalá Castro
 */
public interface MonopolyInterface extends Remote {
    
    public boolean logIn(String name)throws RemoteException;
    public boolean logOut(String name) throws RemoteException;
    public int tosseDice(String name)  throws RemoteException;
}
