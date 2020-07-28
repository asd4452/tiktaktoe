import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    char symbol;
    boolean hasTurn = true;
    boolean hasWon = false;

    void placeSymbol(GameBoard gameBoard){
        while(true){
            System.out.print("player " + this.symbol + " chose a row (0-2): ");
            int row = Input.getInteger(0, 2);

            System.out.print("player " + this.symbol + " chose a column (0-2): ");
            int column = Input.getInteger(0, 2);

            if (verifySymbolPlacement(row, column, gameBoard)){
                gameBoard.boxes[row][column] = this.symbol;
                break;
            }else {
                System.out.println("That field is occupied or invalid. Try again.");
            }
        }
    }

    boolean verifySymbolPlacement(int row, int column, GameBoard gameBoard){
        try{
            if(gameBoard.boxes[row][column] == ' ') return true;
        }catch (Exception error){
            return false;
        }
        return  false;
    }
}
