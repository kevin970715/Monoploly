/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public int 
}
