import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    char symbol;
    boolean hasTurn = true;
    boolean hasWon = false;

    void placeSymbol(GameBoard gameBoard){
        System.out.print("Chose a row: ");
        int row = scanner.nextInt();

        System.out.print("Chose a column: ");
        int column = scanner.nextInt();

        gameBoard.boxes[row][column] = this.symbol;
    }
}
