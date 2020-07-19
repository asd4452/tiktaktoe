public class OutputManager {

    public static void printWelcomeMessage(){
        System.out.println("===========================");
        System.out.println("|         Welcome         |");
        System.out.println("|           to            |");
        System.out.println("|        TikTakToe        |");
        System.out.println("===========================");

    }

    public static void printMainMenu(){
        System.out.println("\n=======  MAIN MENU  =======");
        System.out.println("(1) to setup the game");
        System.out.println("(0) to exit");
        System.out.println("===========================");
    }
    public static void printGameModeMenu(){
        System.out.println("\n========  GAME MODE ========");
        System.out.println("(1) PvP");
        System.out.println("(2) PvE");
        System.out.println("(3) return to MAIN MENU");
        System.out.println("(0) to exit");
        System.out.println("===========================");
    }

    public static void printErrorMenuOption(int menuOption){
        System.out.println("Unknown menu option \"" + menuOption + "\". Try again.");
    }
    public static void printErrorMenuOption(String unacceptableOption){
        System.out.println("Unknown menu option \"" + unacceptableOption + "\". Try again.");
    }

    public static void promptForMenuOption(){
        System.out.print("Enter your option: ");
    }

}
