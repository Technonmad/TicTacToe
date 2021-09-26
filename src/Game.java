import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;

public class Game extends PanelGame{

    //private Scanner in = new Scanner(System.in);
    public String playerx = "x";
    public String playero = "o";
    public String currentPlayer = playerx;
    private static Game instance = new Game();



    public void StartGame() {

    }

    public static Game getInstance(){
        return instance;
    }

    public String getPlayerSign(){
        if(currentPlayer == playerx)
            return playerx;
        else
            return playero;
    }

    public void swapPlayers(){
        if (currentPlayer == playerx)
            currentPlayer = playero;
        else
            currentPlayer = playerx;
    }

    public boolean checkFreeSpace(JButton[][] buttonsArray){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(buttonsArray[i][j].isEnabled())
                    return true;
            }
        }
        return false;
    }

}
