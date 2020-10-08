package com.capg.ws;

import java.util.Scanner;

public class TicTacToe {
	
	Scanner sc = new Scanner(System.in);

	public String[] tictactoe = new String[10];
	
	public void createBoard() {		
		
		for(int i = 1; i < tictactoe.length; i++ )
			tictactoe[i] = " ";
	}
	
	public String chooseInput() {
		
		System.out.println("Enter 'x' or 'o' ");
		String input = sc.nextLine();
		
		if(input.equalsIgnoreCase("x")) {
			input = "o" ;
		}
		else if(input.equalsIgnoreCase("o")){
			input = "x";
		}
		else {
			System.out.println("Invalid input");
		}
		return input;
	}
	public static void main(String[] args) {
		TicTacToe obj = new TicTacToe();
		obj.createBoard();
		obj.chooseInput();
	}
}
