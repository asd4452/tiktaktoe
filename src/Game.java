import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    public static String mode;
    public static int rounds;
    public static boolean newRound = false;

    public static void setup(String gameMode, Player player1, Player player2) {
        Scanner scanner = new Scanner(System.in);
        if (gameMode.equals("PvP")) {
            System.out.println("-- PvP Game Setup --");

            System.out.print("Enter Player1 Name: ");
            player1.name = scanner.nextLine();

            System.out.print("\nEnter Player2 Name: ");
            player2.name = scanner.nextLine();

            System.out.print("Enter a number of rounds to play: ");
            Game.rounds = Input.getNumber();
        } else {
            System.out.println("-- PvE Game Setup --");

            System.out.print("Enter Player1 Name: ");
            player1.name = scanner.nextLine();
            player2.name = "MyNameIsBot";
        }
        player1.symbol = 'O';
        player2.symbol = 'X';

    }

    public static void start(Player player1, Player player2) throws InterruptedException {
        Field currentField = new Field();
        currentField.initialize();
        currentField.print(player1, player2);
        System.out.println();
        int roundsPlayed = 0;
        while (player1.numberOfWins < Game.rounds && player2.numberOfWins < Game.rounds) {

            if (Game.newRound == true) {
                currentField.print(player1, player2);
            }

            if (player2.hasWon == false) {
                player1.turn(currentField, player1, Field.usedField);
                currentField.print(player1, player2);
                player1.hasWon = Game.checkForWinner(currentField, player1.symbol);
            } else {
                player2.numberOfWins++;
                roundsPlayed++;
                System.out.println("\n\n" + player2.name + " has won round number " + roundsPlayed  + "out of " + Game.rounds + "\n");
                System.out.println("==== ROUND NUMBER " + roundsPlayed + " ====");
            }

            if (player1.hasWon == false) {
                player2.turn(currentField, player2, Field.usedField);
                currentField.print(player1, player2);
                player2.hasWon = Game.checkForWinner(currentField, player2.symbol);
            } else {
                player1.numberOfWins++;
                roundsPlayed++;
                System.out.println("\n\n" + player1.name + " has won round number " + roundsPlayed + " out of " + Game.rounds + "\n");
                System.out.println("==== ROUND NUMBER " + roundsPlayed + " ====");
            }


        }
        System.out.println("Total game rounds: " + Game.rounds);
        System.out.println(player1.name + " wins: " + player1.numberOfWins);
        System.out.println(player2.name + " wins: " + player2.numberOfWins);

    }

    private static boolean checkForWinner(Field currentField, char playerSymbol) {
        int totalSymbolsInLine = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (currentField.fieldToDisplay[i][j] == playerSymbol) {
                    totalSymbolsInLine++;
                    if (totalSymbolsInLine == 3) {
                        currentField.initialize();
                        Game.newRound = true;
                        return true;
                    }
                }
            }
            totalSymbolsInLine = 0;

        }
        return false;
    }
}





