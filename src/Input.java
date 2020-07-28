import java.util.Scanner;

public class Input {


    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                int userInput = scanner.nextInt();
                if (String.valueOf(userInput).length() == 1 && userInput >= min && userInput <= max) return userInput;
            }catch (Exception error){
                System.out.println("That is not an integer");
            }
            scanner.nextLine();
            System.out.print("Try again: ");
        }

    }
}
