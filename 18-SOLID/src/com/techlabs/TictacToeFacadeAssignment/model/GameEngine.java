package com.techlabs.TictacToeFacadeAssignment.model;

public class GameEngine {
    private Players currentPlayer;

    public GameEngine(Players startingPlayer) {
        this.currentPlayer = startingPlayer;
    }

    public boolean playTurn(Board board, int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid input! Enter values between 0 and 2.");
            return false;
        }
        if (!board.isCellEmpty(row, col)) {
            System.out.println("Cell already occupied! Try again.");
            return false;
        }
        board.placeSymbol(row, col, currentPlayer.getSymbol().name().charAt(0));
        return true;
    }

    public boolean isWinningMove(Board board, char symbol) {
        char[][] grid = board.getGrid();
        for (int i = 0; i < 3; i++) {
            if ((grid[i][0] == symbol && grid[i][1] == symbol && grid[i][2] == symbol) ||  // row
                (grid[0][i] == symbol && grid[1][i] == symbol && grid[2][i] == symbol))    // column
                return true;
        }

        // Diagonals
        return (grid[0][0] == symbol && grid[1][1] == symbol && grid[2][2] == symbol) ||
               (grid[0][2] == symbol && grid[1][1] == symbol && grid[2][0] == symbol);
    }

    public void switchPlayer(Players p1, Players p2) {
        currentPlayer = (currentPlayer == p1) ? p2 : p1;
    }

    public Players getCurrentPlayer() {
        return currentPlayer;
    }
}
