import java.util.Scanner;

public class Player {
    public char symbol;
    Scanner scanner = new Scanner(System.in);
    int numberOfWins, numberOfGames;
    String name;

    Player() {
    }

    Player(String name) {
        this.name = name;
    }

    public void turn(Field currentField, Player currentPlayer) {
        int row = 0, column = 0;

        while (currentField.validateSymbolPlacement(row, column) == false) {
            System.out.print(this.name + " chose a row number (1-3): ");
            row = scanner.nextInt() - 1;

            System.out.print(this.name + " now chose a column number (1-3): ");
            column = scanner.nextInt() - 1;

            if (currentField.validateSymbolPlacement(row, column) == false) {
                System.out.println("The chosen place on the field is invalid. Try again.");
            }
        }

        currentField.setSymbol(row, column, currentPlayer);
    }
}
