import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    char symbol;
    boolean hasTurn = true;
    boolean hasWon = false;

    void placeSymbol(GameBoard gameBoard){
        while(true){
            System.out.print("player " + this.symbol + " chose a row: ");
            int row = scanner.nextInt();

            System.out.print("player " + this.symbol + " chose a column: ");
            int column = scanner.nextInt();

            if (verifySymbolPlacement(row, column, gameBoard)){
                gameBoard.boxes[row][column] = this.symbol;
                break;
            }else {
                System.out.println("That field is occupied. Try again.");
            }
        }
    }

    boolean verifySymbolPlacement(int row, int column, GameBoard gameBoard){
        if(gameBoard.boxes[row][column] == ' ') return true;
        return false;
    }
}
