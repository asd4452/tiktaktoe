import java.util.Scanner;

public class Player {
    public char symbol;
    Scanner scanner = new Scanner(System.in);
    int numberOfWins, numberOfGames;
    String name;
    public int selectedRow = 0;
    public int selectedColumn = 0;
    boolean hasWon = false;

    Player() {
    }

    Player(String name) {
        this.name = name;
    }

    public void turn(Field currentField, Player currentPlayer, String[][] usedField) {

        while (true) {
            System.out.print(this.name + "(" + this.symbol + ")" + " chose a row number (1-3): ");
            this.selectedRow = scanner.nextInt() - 1;
            System.out.print(this.name + "(" + this.symbol + ")" + " now chose a column number (1-3): ");
            this.selectedColumn = scanner.nextInt() - 1;

            if (currentField.validateSymbolPlacement(this.selectedRow, this.selectedColumn) == false) {
                System.out.println("The chosen place on the field is invalid. Try again.");
            } else {
                currentField.setSymbol(this.selectedRow, this.selectedColumn, currentPlayer);
                Field.usedField[this.selectedRow][this.selectedColumn] = String.valueOf(currentPlayer.symbol);
                break;
            }
        }


    }
}
