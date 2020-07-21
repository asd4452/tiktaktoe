public class Main {

    public static void main(String[] args) throws InterruptedException {

        OutputManager.printWelcomeMessage();

        Player player1 = new Player();
        Player player2 = new Player();
        Menu.setOption();
        Game.setup(Game.mode, player1, player2);
        Game.start(player1, player2);


    }
}
