import java.util.Scanner;

public class Main {
    public static void main(String[] argv){

        MyField field = new MyField();
        PlayerTurn playerTurn = new PlayerTurn();
        Scanner in = new Scanner(System.in);
        field.showField();

        for(int k = 0; k < 10; k++){



            if (k % 2 != 0){
                System.out.println("Ходят крестики!");

                System.out.print("Input x: ");
                int x = in.nextInt();
                System.out.print("Input y: ");
                int y = in.nextInt();
                System.out.println();

                playerTurn.PlayerX(x);
                playerTurn.PlayerY(y);
                if (x <= field.field.length && y <= field.field.length) {
                    field.editFieldX(x, y);
                }
            }
            else {
                System.out.println("Ходят нолики!");

                System.out.print("Input x: ");
                int x = in.nextInt();
                System.out.print("Input y: ");
                int y = in.nextInt();
                System.out.println();

                playerTurn.PlayerX(x);
                playerTurn.PlayerY(y);
                if (x <= field.field.length && y <= field.field.length) {
                    field.editFieldO(x, y);
                }
            }

            if(!field.checkFreeSpace()) {
                System.out.println("Ничья!");
                break;
            }
            if(field.checkWin1()){
                System.out.println("Крестики одержали победу!");
                break;
            }
            if(field.checkWin2()){
                System.out.println("Нолики одержали победу!");
                break;
            }
        }

    }
}
