package com.arham.game;

import java.util.Scanner;

public class HumanPlayer extends Player {

	public HumanPlayer(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}
	
	void makeMove() {
		Scanner sc = new Scanner(System.in);
		int row;
		int column;
		do {
			System.out.println("Enter the row and column");
			row = sc.nextInt();
			column = sc.nextInt();
		} while (!isValidMove(row, column));
		
		TicTacToe.placeMark(row, column, mark);
	}
}
