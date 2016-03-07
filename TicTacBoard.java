class TicTacBoard{

	private int[][] board;

	public TicTacBoard(){
		board = new int[5][5];
		for(int row = 0; row < board.length; row++){
			for(int col = 0; col < board.length; col++){
				if(!(row % 2 == 0)){
					board[row][col] = 3;
				} 
				else if(!(col % 2 == 0)){
					board[row][col] = 4;
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
				}
				if(board[row][col] == 1){
					output += "X";
				}
				if(board[row][col] == 2){
					output += "O";
				}
				if(board[row][col] == 4){
					output += "|";
				}
				if(board[row][col] == 3){
					output += "-";
				}
			}
			output += "\n";
		}
		return output;
	}

	public int checkWin(){
		
	}
}