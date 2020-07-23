public class GameBoard {

    private boolean boxesAreFull = false;
    char boxes[][] = new char[3][3];


     void show() {
         System.out.println("______________________");
         System.out.println("   |  0  |  1  |  2  |");
         for (int row = 0; row < 3; row++) {
            System.out.print( row + "  " );
            for (int column = 0; column < 3; column++) {
                System.out.print("|  " + boxes[row][column] + "  ");
            }
            System.out.print("|\n");
        }
        System.out.println("______________________");
     }

    void empty() {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                boxes[row][column] = ' ';
            }
        }
    }
}

