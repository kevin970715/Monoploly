package server;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Monopoly {
	Die die = new Die();
	Board board;
	
	public Monopoly() {
		board = new Board();
	}
	
	public static void main(String[] args) throws RemoteException {
		System.out.println("\tMonopoly\n");
		Scanner scanner = new Scanner(System.in);
		int totalPlayer = 0;
		while (totalPlayer < 2 || totalPlayer > 8) {
			try {
				System.out.println("How many people are playing?");
				System.out.print("Players (2 - 8): ");
				totalPlayer = scanner.nextInt();
			}
			catch(Exception e) {
				System.err.println("Error: Number too large.");
				continue;
			}
			if(totalPlayer > 8) {
				System.err.println("Error: Invalid player count.");
			}
		}
		scanner.close();
		Monopoly game = new Monopoly();
		game.startGame();
	}
	
	public void startGame() throws RemoteException {
		System.out.println("Game start!");
		System.out.println("========");
		while (!board.hasWinner()){
			if(!board.getCurrentPlayer().isBrokeOut()){
				int face1 = board.tosseDice();
                                int face2 = board.tosseDice();
				board.movePlayer(board.getCurrentPlayer().getName(), face1,face2);
			}
			board.nextTurn();
		}
		System.out.println("========");
		if(board.hasWinner()){
                    System.out.println(board.getWinner().getName() + " is won by don't brokeout!");
		}else{
                    System.out.println(board.getMaxMoneyPlayer().getName() + " is won by have most money!");
		}
		System.out.println("Game over!");
	}
	
}
