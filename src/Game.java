import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;

public class Game extends PanelGame{

    //private Scanner in = new Scanner(System.in);
    private String playerx = "x";
    private String playero = "o";
    private String currentPlayer = playerx;

    public void StartGame() {

    }

    public void swapPlayers(){
        if (currentPlayer == playerx)
            currentPlayer = playero;
        else
            currentPlayer = playerx;
    }

}
