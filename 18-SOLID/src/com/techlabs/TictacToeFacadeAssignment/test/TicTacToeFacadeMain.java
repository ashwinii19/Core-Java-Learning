package com.techlabs.TictacToeFacadeAssignment.test;

import com.techlabs.TictacToeFacadeAssignment.model.TicTacToeFacade;

public class TicTacToeFacadeMain {

	public static void main(String[] args) {
		
		System.out.println();
        System.out.println("    ┌───────┬───────┬───────┐");
        System.out.println("    │  TIC  │   X   │   O   │");
        System.out.println("    ├───────┼───────┼───────┤"); //
        System.out.println("    │   X   │  TAC  │   X   │");
        System.out.println("    ├───────┼───────┼───────┤");
        System.out.println("    │   O   │   X   │  TOE  │");
        System.out.println("    └───────┴───────┴───────┘");
        System.out.println();
		
		  TicTacToeFacade game = new TicTacToeFacade();
	        game.startGame();
	}
}
