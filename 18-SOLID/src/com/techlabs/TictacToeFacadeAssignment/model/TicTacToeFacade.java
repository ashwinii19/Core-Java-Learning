package com.techlabs.TictacToeFacadeAssignment.model;

import java.util.Scanner;

public class TicTacToeFacade {
    private final Scanner scanner = new Scanner(System.in);
    private Players player1, player2;
    private final Board board = new Board();
    private GameEngine engine;

    public void startGame() {
        System.out.println("Welcome to Tic Tac Toe!\n");

        player1 = new Players(getValidName("Player 1"), Symbol.X);
        player2 = new Players(getValidName("Player 2"), Symbol.O);

        engine = new GameEngine(player1);

        while (true) {
            board.displayBoard();
            Players current = engine.getCurrentPlayer();

            System.out.printf("\n%s's (%s) turn. Enter row and column (0-2): ",
                    current.getName(), current.getSymbol().name());

            int row, col;
            try {
                row = scanner.nextInt();
                col = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers between 0 and 2.");
                scanner.nextLine(); 
                continue;
            }

            boolean valid = engine.playTurn(board, row, col);
            if (!valid) continue;

            if (engine.isWinningMove(board, current.getSymbol().name().charAt(0))) {
                board.displayBoard();
                System.out.printf("\nResult: %s wins! Congratulations!\n", current.getName());
                break;
            }

            if (board.isFull()) {
                board.displayBoard();
                System.out.println("\nResult: It's a draw!");
                break;
            }

            engine.switchPlayer(player1, player2);
        }

        System.out.println("\nGame Over. Thanks for playing!");
    }

    private String getValidName(String playerLabel) {
        String name;
        while (true) {
            System.out.print(playerLabel + ", enter your name (letters only): ");
            name = scanner.nextLine().trim();

            if (name.matches("[a-zA-Z ]+")) {
                return name;
            } else {
                System.out.println("Invalid name! Please avoid numbers and special characters.");
            }
        }
    }
}
