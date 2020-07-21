public class Field {
    char[][] fieldToDisplay = new char[3][3];
    public static String[][] usedField = new String[3][3];

    public void initialize() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.fieldToDisplay[i][j] = '-';
                Field.usedField[i][j] = "FREE";
            }
        }
    }

    public void print(Player player1, Player player2) {
        System.out.println("===========================");
        System.out.println("        SCORE BOARD        ");
        System.out.println("|" + player1.name + ": " + player1.numberOfWins + "         " + player2.name + ": " + player2.numberOfWins + "|");
        System.out.println("===========================");
        for (int i = 0; i < 3; i++) {
            System.out.print("      |");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + fieldToDisplay[i][j] + " |");
            }
            System.out.println();
        }
        System.out.println("===========================");

    }


    public boolean validateSymbolPlacement(int row, int column) {
        if (this.fieldToDisplay[row][column] == '-' || Field.usedField[row][column] == "FREE") {
            return true;
        }
        return false;
    }

    public void setSymbol(int row, int column, Player currentPlayer) {
        this.fieldToDisplay[row][column] = currentPlayer.symbol;
    }
}
