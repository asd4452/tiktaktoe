public class Game {
    int totalTurns;
    boolean foundWinner = false;

    void start(Player playerOne, Player playerTwo, GameBoard gameBoard) {

        while (!foundWinner && totalTurns < 9) {
            if (playerOne.hasTurn) {
                playerOne.placeSymbol(gameBoard);
                playerOne.hasTurn = false;
                playerTwo.hasTurn = true;
                this.totalTurns++;
                foundWinner = checkForWinner(gameBoard, playerOne.symbol);
                if (foundWinner) playerOne.hasWon = true;

            } else {
                playerTwo.placeSymbol(gameBoard);
                playerTwo.hasTurn = false;
                playerOne.hasTurn = true;
                this.totalTurns++;
                foundWinner = checkForWinner(gameBoard, playerTwo.symbol);
                if (foundWinner) playerTwo.hasWon = true;
            }

            gameBoard.show();
        }

        if (playerOne.hasWon) {
            System.out.println("player " + playerOne.symbol + " has won!");
        } else if (playerTwo.hasWon) {
            System.out.println("player " + playerTwo.symbol + " has won!");
        } else {
            System.out.println("The game was a tie!");
        }


    }

    boolean checkForWinner(GameBoard gameBoard, char playerSymbol) {
        int sameHorizontalSymbols = 0;
        int sameVerticalSymbols = 0;

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {

                if (gameBoard.boxes[row][column] == playerSymbol) {
                    sameHorizontalSymbols++;
                    if (sameHorizontalSymbols == 3) {
                        return true;
                    }
                }

                if (gameBoard.boxes[column][row] == playerSymbol) {
                    sameVerticalSymbols++;
                    if (sameVerticalSymbols == 3) {
                        return true;
                    }
                }

                //check for same diagonal symbols
                if ((row == 1 && column == 1) && (playerSymbol == gameBoard.boxes[1][1])) {
                    if (gameBoard.boxes[1][1] == gameBoard.boxes[row - 1][column - 1] &&
                            gameBoard.boxes[1][1] == gameBoard.boxes[row + 1][column + 1]) {
                        return true;
                    } else if (gameBoard.boxes[1][1] == gameBoard.boxes[row + 1][column - 1] &&
                                gameBoard.boxes[1][1] == gameBoard.boxes[row -1][column + 1]){
                        return true;
                    }
                }

            }
            sameHorizontalSymbols = 0;
            sameVerticalSymbols = 0;
        }

        return false;
    }

    public void reset(GameBoard gameBoard, Player playerOne, Player playerTwo) {
        totalTurns = 0;
        foundWinner = false;
        playerOne.hasWon = false;
        playerTwo.hasWon = false;
        gameBoard.empty();
    }
}
