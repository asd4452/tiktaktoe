import java.util.Scanner;

public class Input {


    public static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                int number = scanner.nextInt();
                return number;
            }catch (Exception e){
                System.out.print("Than is not a number. Try again: ");
            }
        }

    }

    public static String getString(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                String string = scanner.nextLine();
                return string;
            }catch (Exception e){
                System.out.print("Than is not a string. Try again: ");
            }
        }

    }
}
