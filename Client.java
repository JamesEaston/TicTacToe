import java.util.*;

class Client{
	public static void main(String[] args){
		//Declares the player objects
		Scanner player = new Scanner(System.in);
		//Declares a variable to store if the players want to play
		boolean play = true;
		//Declares variables to store where the player wants to make a move
		int col = 0;
		int row = 0;
		//Declares objects to store which player is an "X" and "O"
		int playerOneSign = 1;
		int playerTwoSign = 2;
		//Declares a score count
		int playerOneWinCount = 0;
		int playerTwoWinCount = 0;
		int drawCount = 0;
		int moves = 0;
		boolean validMove = false;
		while(play){
			moves = 0;
			validMove = false;
			TicTacBoard board = new TicTacBoard();
			System.out.println(board.toString());
			while(moves < 9){
				System.out.println("Player One, it is your move.");
				while(!validMove){
					//Prompts the player to make a move and stores the move made
					System.out.println("Please choose the column where you want to make a move ");
					col = Integer.parseInt(player.nextLine());
					System.out.println("Please choose the row where you want to make a move ");
					row = Integer.parseInt(player.nextLine());
					//Checks to make sure the move is valid
					validMove = board.checkForValidity(col, row);
					//If the move was not valid, the while loop loops again and
					//prompts the player for a new move
					if(!validMove){
						System.out.println("That is not a valid move, please choose another");
					}
				}
				board.setMove(col, row, playerOneSign);
				moves++;
				System.out.println(board.toString());
				//If player one wins with his last move, the loop is broken
				if(board.checkWin(playerOneSign)){
					System.out.println("Player One Wins!");
					playerOneWinCount++;
					break;
				}
				if (moves == 9){
					break;
				}
				validMove = false;
				System.out.println("Player Two, it is your move");
				while(!validMove){
					//Prompts the player to make a move and stores the move made
					System.out.println("Please choose the column where you want to make a move ");
					col = Integer.parseInt(player.nextLine());
					System.out.println("Please choose the row where you want to make a move ");
					row = Integer.parseInt(player.nextLine());
					//Checks to make sure the move is valid
					validMove = board.checkForValidity(col, row);
					//If the move was not valid, the while loop loops again and
					//prompts the player for a new move
					if(!validMove){
						System.out.println("That is not a valid move, please choose another");
					}
				}
				board.setMove(col, row, playerTwoSign);
				moves++;
				System.out.println(board.toString());
				//If player two wins with his last move, the loop is broken
				if(board.checkWin(playerTwoSign)){
					System.out.println("Player Two Wins!");
					playerTwoWinCount++;
					break;
				}
				validMove = false;
			}
		if(moves == 9){
			System.out.println("Draw");
			drawCount++;
		}
		System.out.println("Player One Wins: " + playerOneWinCount);
		System.out.println("Player Two Wins: " + playerTwoWinCount);
		System.out.println("Draws: " + drawCount);
		System.out.println("Do you want to play again? (Reply with true or false)");
		play = Boolean.parseBoolean(player.nextLine());
	}
	System.out.println("Thanks for playing!");
	}
}
