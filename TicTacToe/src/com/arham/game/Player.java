package com.arham.game;

public abstract class Player {
	String name;
	char mark;
	abstract void makeMove();
	boolean isValidMove(int row, int column) {
		if(row>=0 && column>=0 && row<=2 && column<=2) {
			if(TicTacToe.board[row][column] == ' ') {
				return true;
			}
		}
		return false;
	}
}
