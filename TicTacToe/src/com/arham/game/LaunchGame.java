package com.arham.game;

import java.util.Scanner;

public class LaunchGame {
	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of player");
		int n = sc.nextInt();
		if(n == 1) {
			System.out.println("Enter player name: ");
			String p = sc.next();
			HumanPlayer player1 = new HumanPlayer(p, 'X');
			AiPlayer player2 = new AiPlayer("Jenny", '0');
	
			Player currentPlayer;
			currentPlayer = player1;
			while(true) {
				System.out.println(currentPlayer.name + " turn ");
				currentPlayer.makeMove();
				t.dispBoard();
				if(t.checkColWin()||t.checkRowWin()||t.checkDiagonalWin()) {
					System.out.println(currentPlayer.name + " has won!");
					break;
				}else if(t.checkDraw()){
					System.out.println("Game is a draw!");
					break;
				}else {
					if(currentPlayer == player1) {
						currentPlayer = player2;
					}else {
						currentPlayer = player1;
					}
				}
			}
		}else if(n == 2) {
			System.out.println("Enter Player 1 name: ");
			String p1 = sc.next();
			System.out.println("Enter Player 2 name: ");
			String p2 = sc.next();
			HumanPlayer player1 = new HumanPlayer(p1,'X');
			HumanPlayer player2 = new HumanPlayer(p2,'0');
			Player currentPlayer;
			currentPlayer = player1;
			while(true) {
				System.out.println(currentPlayer.name + " turn ");
				currentPlayer.makeMove();
				t.dispBoard();
				if(t.checkColWin()||t.checkRowWin()||t.checkDiagonalWin()) {
					System.out.println(currentPlayer.name + " has won!");
					break;
				}else if(t.checkDraw()){
					System.out.println("Game is a draw!");
					break;
				}else {
					if(currentPlayer == player1) {
						currentPlayer = player2;
					}else {
						currentPlayer = player1;
					}
				}
			}
		}else {
			System.out.println("Wrong input!");
		}


	}
}
