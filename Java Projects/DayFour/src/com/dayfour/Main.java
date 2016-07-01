package com.dayfour;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static Map<Location, Type> tictactoe = new HashMap<Location, Type>();
	private static boolean gameOver;
	private static int turn;
	public static void main(String[] args) {
		
		for(Location s : Location.values()){
			tictactoe.put(s, Type.EMPTY);
		}
		Scanner scan = new Scanner(System.in);
		printBoard();
		while(true){
		System.out.println("Player 1: What row do you want to put your X");
		while(!scan.hasNext());
		String row = scan.next();
		System.out.println("Player 1: What column do you want to put your X");
		while(!scan.hasNext());
		String column = scan.next();
		String total = row + column;
		boolean repeat = false;
		for(Location l : Location.values()){
			if(l.getInput().contains(total)){
				if(tictactoe.get(l) != Type.EMPTY){
					repeat = true;
					break;
				}
				tictactoe.remove(l);
				tictactoe.put(l, Type.TIC);
				break;
			}
		}
		if(repeat){
			System.out.println("Location specified is in use; You have been skipped");
		}
		printBoard();
		int remaining = 0;
		for(Location l : Location.values()){
			if(tictactoe.get(l) == Type.EMPTY){
				remaining++;
			}
		}
		if(remaining == 0){
			break;
		}
		System.out.println("Player 2: What row do you want to put your X");
		while(!scan.hasNext());
		String row2 = scan.next();
		System.out.println("Player 2: What column do you want to put your X");
		while(!scan.hasNext());
		String column2 = scan.next();
		String total2 = row2 + column2;
		boolean repeat2 = false;
		for(Location l : Location.values()){
			if(l.getInput().contains(total2)){
				if(tictactoe.get(l) != Type.EMPTY){
					repeat2 = true;
					break;
				}
				tictactoe.remove(l);
				tictactoe.put(l, Type.TAC);
				break;
			}
		}
		if(repeat2){
			System.out.println("Location specified is in use; You have been skipped");
		}
		printBoard();
		remaining = 0;
		for(Location l : Location.values()){
			if(tictactoe.get(l) == Type.EMPTY){
				remaining++;
			}
		}
		if(remaining == 0){
			break;
		}
		}
		scan.close();
	}
	
	public int whoWon(){
		for(Location l : Location.values()){
			
		}
		return 0;
	}
	
	public static void printBoard(){
		System.out.println("-1-2-3-");
		System.out.println("1" + tictactoe.get(Location.C1_R1).getTitle() + "|" + tictactoe.get(Location.C1_R2).getTitle() + "|" + tictactoe.get(Location.C1_R3).getTitle());
		System.out.println("-------");
		System.out.println("2" + tictactoe.get(Location.C2_R1).getTitle() + "|" + tictactoe.get(Location.C2_R2).getTitle() + "|" + tictactoe.get(Location.C2_R3).getTitle());
		System.out.println("-------");
		System.out.println("3" + tictactoe.get(Location.C3_R1).getTitle() + "|" + tictactoe.get(Location.C3_R2).getTitle() + "|" + tictactoe.get(Location.C3_R3).getTitle());
	}
}
