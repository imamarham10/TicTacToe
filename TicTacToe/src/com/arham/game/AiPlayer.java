package com.arham.game;

import java.util.Random;

public class AiPlayer extends Player{
		public AiPlayer(String name, char mark) {
			this.name = name;
			this.mark = mark;
		}
		
		void makeMove() {
			int row;
			int column;
			do {
				Random r = new Random();
				row = r.nextInt(3);
				column = r.nextInt(3);
			} while (!isValidMove(row, column));
			
			TicTacToe.placeMark(row, column, mark);
		}
		
	
}
