package com.dayfour;

import java.util.Scanner;

public class TicTacToe {
	private static String[][] board = new String[3][3];
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		boolean deadgame = false;
		String whoOne = "";
		boolean turn = false;
		
		while(!deadgame){
			printBoard();
			if(check("O")){
				deadgame = true;
				whoOne = "Player 1";
				continue;
			}
			if(check("X")){
				deadgame = true;
				whoOne = "Player 2";
				continue;
			}
			
			if(turn == false){
				//Player 1
				System.out.println("[Player 1] What row would you like to move?");
				while(!scanner.hasNext());
				int row = scanner.nextInt() - 1;
				System.out.println("[Player 1] What column would you like to move?");
				while(!scanner.hasNext());
				int col = scanner.nextInt() - 1;
				try{
				if(board[row][col] == null){
					board[row][col] = "O";
					turn = true;
				}else{
					System.out.println("[Warn] You cannot place a tic there. Code: -1");
					System.out.println(board[row][col]);
					continue;
				}
				}catch(ArrayIndexOutOfBoundsException e){
					System.out.println("[Warn] You cannot place a tic there. Code: -2");
					continue;
				}
			}else{
				//Player 2
				System.out.println("[Player 2] What row would you like to move?");
				while(!scanner.hasNext());
				int row = scanner.nextInt() - 1;
				System.out.println("[Player 2] What column would you like to move?");
				while(!scanner.hasNext());
				int col = scanner.nextInt() - 1;
				try{
				if(board[row][col] == null){
					board[row][col] = "X";
					turn = false;
				}else{
					System.out.println("[Warn] You cannot place a tic there. Code: -3");
					continue;
				}
				}catch(ArrayIndexOutOfBoundsException e){
					System.out.println("[Warn] You cannot place a tic there. Code: -4");
					continue;
				}
			}
			
		}
		System.out.println(whoOne + " won the game!");
		scanner.close();
	}
	
	private static void printBoard(){
		System.out.println("O-1-2-3-");
		String line1 = (board[0][0] + "|" + board[0][1] + "|" + board[0][2]).replace("null", " ");
		String line2 = (board[1][0] + "|" + board[1][1] + "|" + board[1][2]).replace("null", " ");
		String line3 = (board[2][0] + "|" + board[2][1] + "|" + board[2][2]).replace("null", " ");
		System.out.println("1|" + line1);
		System.out.println("2|" + line2);
		System.out.println("3|" + line3);
	}
	
	private static boolean check(String s){
		if(board[0][0] == s && board[0][1] == s && board[0][2] == s){
			return true;
		}else if(board[1][0] == s && board[1][1] == s && board[1][2] == s){
			return true;
		}else if(board[2][0] == s && board[2][1] == s && board[2][2] == s){
			return true;
		}else if(board[0][0] == s && board[1][1] == s && board[2][2] == s){
			return true;
		}else if(board[2][0] == s && board[1][1] == s && board[0][2] == s){
			return true;
		}else if(board[0][0] == s && board[0][1] == s && board[0][2] == s){
			return true;
		}else if(board[0][0] == s && board[1][0] == s && board[2][0] == s){
			return true;
		}else if(board[0][1] == s && board[1][1] == s && board[2][1] == s){
			return true;
		}else if(board[0][2] == s && board[1][2] == s && board[2][2] == s){
			return true;
		}
		else{
			return false;
		}
	}
}
