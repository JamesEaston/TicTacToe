import java.util.*;

class Client{
	public static void main(String[] args){
		Scanner playerOne = new Scanner(System.in);
		Scanner playerTwo = new Scanner(System.in);
		boolean play = true;
		while(play){
			int moves = 0;
			int winner = 0;
			boolean validMove = true;
			TicTacBoard board = new TicTacBoard();
			System.out.println(board.toString());
			while(winner < 0 && moves < 10){
				while(validMove){
					System.out.println("Player One it is your move.");
// Move this and player two's to a seperate line so it doesnt take multiple repeats within one part.					
				}
				// When taking in column and row, make sure the input is valid
			}
			if(moves == 10){
				System.out.println("Draw");
			}
			play = false;
		}
		System.out.println("Thanks for playing!");
	}
}