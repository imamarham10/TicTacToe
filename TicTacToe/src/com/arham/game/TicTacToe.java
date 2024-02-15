package com.arham.game;

public class TicTacToe {
	static char[][] board;

	public TicTacToe() {
		board = new char[3][3];
		initBoard();
	}


	void initBoard() {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				board[i][j] = ' ';
			}
		}
	}

	void dispBoard() {
		System.out.println("-------------");
		for(int i=0; i<board.length;i++) {
			System.out.print("| ");
			for(int j=0;j<board[i].length;j++) {
				System.out.print(board[i][j]+" | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}

	static void placeMark(int row, int column, char mark) {
		if(row>=0 && row<= 2 && column>=0 && column<=2 ) {
			board[row][column] = mark;
		}else {
			System.err.println("Invalid Position");
		}		
	}

	boolean checkColWin() {
		for(int j = 0; j<=2 ; j++) {
			if(board[0][j]!=' ' && board[1][j] != ' ' && board[2][j] != ' ') {
				if(board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
					return true;
				}
			}
		}
		return false;
	}
	boolean checkRowWin() {
		for(int i=0; i<=2; i++) {
			if(board[i][0]!=' ' && board[i][1] != ' ' && board[i][2] != ' ') {
				if(board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
					return true;
				}
			}
		}
		return false;
	}
	boolean checkDiagonalWin() {
		if(board[0][0]!= ' ' && board[1][1] != ' ' && board[2][2] != ' ' || board[0][2] != ' ' && board[2][0] != ' ' && board[1][1] != ' ') {
			if(board[0][0] == board[1][1] && board[1][1] == board[2][2]
					|| board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	boolean checkDraw() {
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=2; j++) {
				if(board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}
}
