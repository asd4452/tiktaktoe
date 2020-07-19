import java.util.Scanner;

public class Menu {
    public static String menuMode = "main-menu";

    public static void setOption() {
        Scanner scanner = new Scanner(System.in);
        int menuOption;

        while (true) {
            if (Menu.menuMode.equals("main-menu")) {
                OutputManager.printMainMenu();
                OutputManager.promptForMenuOption();
                try {
                    menuOption = scanner.nextInt();
                    if (menuOption == 1) {
                        Menu.menuMode = "mode-menu";
                    } else if (menuOption == 0) {
                        System.out.println("Exiting Game...");
                        System.exit(0);
                    } else {
                        OutputManager.printErrorMenuOption(menuOption);
                    }
                } catch (Exception e) {
                    String unacceptableOption = scanner.next();
                    OutputManager.printErrorMenuOption(unacceptableOption);
                }
            } else if (Menu.menuMode.equals("mode-menu")) {
                OutputManager.printGameModeMenu();
                OutputManager.promptForMenuOption();
                try {
                    menuOption = scanner.nextInt();
                    if(menuOption == 1){
                        Game.mode = "PvP";
                        break;
                    }else if(menuOption == 2){
                        Game.mode = "PvE";
                    }else if(menuOption == 3){
                        Menu.menuMode = "main-menu";
                    }else if(menuOption == 0){
                        System.out.println("Exiting Game...");
                        System.exit(0);
                    }
                    else {
                        OutputManager.printErrorMenuOption(menuOption);
                    }
                }catch (Exception e) {
                    String unacceptableOption = scanner.next();
                    OutputManager.printErrorMenuOption(unacceptableOption);
                }
            }

        }
    }

}
