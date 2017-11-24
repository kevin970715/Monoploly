package client;

import interfaces.MonopolyInterface;

/**
 *
 * @author user1
 */
public class ThreadClient extends Thread implements Runnable{
    MonopolyForm mf; 
    MonopolyInterface mi; 
    String name;
    public ThreadClient(MonopolyForm mf, MonopolyInterface mi, String name){
        this.mf=mf;
        this.mi=mi;
        this.name=name;
    } 
    @Override
    public void run(){
        while(true){
            try {
                mf.showTurn(mi.getTurn());
                mf.addPlayers(mi.getPlayers());
                mf.addMessaje(mi.getMessage(name));
            } catch(Exception ex) {
                System.out.println("Error al sincronizar los datos");
            }
            try {
                sleep(600);
            } catch (InterruptedException ex) {
                System.out.println("InterruptedException");
            }
        }  
    }
}
