import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameBoard gameBoard = new GameBoard();
        Player playerOne = new Player();
        Player playerTwo = new Player();
        Game game = new Game();
        String playAgain = "yes";

        playerOne.symbol = 'X';
        playerTwo.symbol = 'O';


        while (playAgain.equals("yes")) {
            game.reset(gameBoard, playerOne, playerTwo);
            gameBoard.show();
            game.start(playerOne, playerTwo, gameBoard);
            System.out.print("Play again (yes/no)? ");
            playAgain = scanner.nextLine();
        }

        System.out.println("Goodbye!");
    }
}
