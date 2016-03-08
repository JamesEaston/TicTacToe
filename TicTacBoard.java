class TicTacBoard{

	//Initializes the board
	private int[][] board;

	//The method for the constructor of the board
	public TicTacBoard(){
		board = new int[6][6];
		//Loops through the positions in the board and fills them
		for(int row = 0; row < board.length; row++){
			for(int col = 0; col < board.length; col++){
				//Checks for the first row or column in the array
				if (row == 0 || col == 0) {
					//If the index is above a playable column the index is
					//filled with what is will be decoded as a "C"
					if((row % 2) == 1){
						board[row][col] = 5;
						continue;
					}
					//If the index is above a playable row the index is
					//filled with what is will be decoded as a "R"
					if((col % 2) == 1){
						board[row][col] = 6;
						continue;
					} else{
						board[row][col] = 7;
					}
				} else {
				 		if(!(row % 2 == 1)){
						board[row][col] = 3;
						continue;
					} 
						else if(!(col % 2 == 1)){
						board[row][col] = 4;
						continue;
					}
					else{
						board[row][col] = 0;
					}
				}
			}
		}
	}
	// Decodes the board to a string that can be printed to the screen
	public String toString() {
		String output = "";
		for(int row = 0; row < board.length; row++){
			for(int col = 0; col < board[row].length; col++){
				if(board[row][col] == 3){
					output += "---";
				}
				if(board[row][col] == 0){
					output += " ";
					continue;
				}
				if(board[row][col] == 5){
					output += "R" + row;
					continue;
				}
				if(board[row][col] == 6){
					output += " C" + col+ " ";
					continue;
				}
				if(board[row][col] == 7){
					output += "  ";
					continue;
				}
				if(board[row][col] == 1){
					output += "X";
					continue;
				}
				if(board[row][col] == 2){
					output += "O";
					continue;
				}
				if(board[row][col] == 4){
					output += "   | ";
					continue;
				}
			}
			output += "\n";
		}
		return output;
	}

	public boolean checkWin(int player){
		int rowCheck = 0;
		int colCheck = 0;
		int diagCheckOne = 0;
		int diagCheckTwo = 0;
		for (int i = 0; i < board.length; i++){
			for (int v = 0; v < board.length; v++){
				if (board[i][v] == player){
					rowCheck++;
				}
				if (board[v][i] == player){
					colCheck++;
				}
			}
			if (rowCheck == 3 || colCheck == 3){
				return true;
			}
			rowCheck = 0;
			colCheck = 0;
			if (board[i][i] == player){
				diagCheckOne++;
			}
			if (board[board.length - 1][i] == player){
				diagCheckTwo++;
			}
		}
		if (diagCheckOne == 3 || diagCheckTwo == 3){
			return true;
		}
		return false;
	}

	public boolean setMove(int x, int y, int player){
		if (board[y][x] > 0){
			return false;
		} else{
			board[y][x] = player;
			return true;
		}
	}
}