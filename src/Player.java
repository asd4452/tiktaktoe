import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    char symbol;
    boolean hasTurn, hasWon;

    void placeSymbol(GameBoard gameBoard, char symbol){
        System.out.print("Chose a row: ");
        int row = scanner.nextInt();

        System.out.println("Chose a column");
        int column = scanner.nextInt();

        gameBoard.boxes[row][column] = symbol;
    }
}
