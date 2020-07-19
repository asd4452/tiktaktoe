import java.util.Scanner;

public class Game {
    public static String mode;
    public static int rounds;

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

    public static void start(Player player1, Player player2) {
        Field currentField = new Field();
        currentField.initialize();
        currentField.print(player1, player2);
        while(player1.numberOfWins < Game.rounds || player2.numberOfWins < Game.rounds){
            player1.turn(currentField, player1);
            Game.checkForWinner(currentField, player1.symbol);
        }
    }

    private static void checkForWinner(Field currentField, char playerSymbol) {
        boolean roundWon = false;
        int index = 0;
        while(true){
            if
        }
    }
}





