package server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author user1
 */
public class MonopolyServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Board monopoly = new Board();
            Naming.bind("monopoly", monopoly);
            System.out.println("Servidor de Monopoly listo!");
        } catch (Exception ex) {
            System.out.println("Error en el servidor.");
        }
    }
}
