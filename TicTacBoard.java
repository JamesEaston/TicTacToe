class TicTacBoard{

	private int[][] board;

	public TicTacBoard(){
		board = new int[5][5];
		for(int row = 0; row < board.length; row++){
			for(int col = 0; col < board.length; col++){
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

	public String toString() {
		String output = "";
		for(int row = 0; row < board.length; row++){
			for(int col = 0; col < board[row].length; col++){
				if(board[row][col] == 0){
					output += " ";
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
				if(board[row][col] == 3){
					output += "---";
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