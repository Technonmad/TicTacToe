import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;

public class Game{

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

    public String checkWin(JButton[][] buttons){

        if ((buttons[0][0].getText() == "x" && buttons[1][1].getText() == "x" && buttons[2][2].getText() == "x")
                ||(buttons[2][0].getText() == "x" && buttons[1][1].getText() == "x" && buttons[0][2].getText() == "x")
                ||(buttons[0][0].getText() == "x" && buttons[1][0].getText() == "x" && buttons[2][0].getText() == "x")
                ||(buttons[0][1].getText() == "x" && buttons[1][1].getText() == "x" && buttons[2][1].getText() == "x")
                ||(buttons[0][2].getText() == "x" && buttons[1][2].getText() == "x" && buttons[2][2].getText() == "x")
                ||(buttons[0][0].getText() == "x" && buttons[0][1].getText() == "x" && buttons[0][2].getText() == "x")
                ||(buttons[1][0].getText() == "x" && buttons[1][1].getText() == "x" && buttons[1][2].getText() == "x")
                ||(buttons[2][0].getText() == "x" && buttons[2][1].getText() == "x" && buttons[2][2].getText() == "x")){
            return "Крестики победили!";
        }
        if ((buttons[0][0].getText() == "o" && buttons[1][1].getText() == "o" && buttons[2][2].getText() == "o")
                ||(buttons[2][0].getText() == "o" && buttons[1][1].getText() == "o" && buttons[0][2].getText() == "o")
                ||(buttons[0][0].getText() == "o" && buttons[1][0].getText() == "o" && buttons[2][0].getText() == "o")
                ||(buttons[0][1].getText() == "o" && buttons[1][1].getText() == "o" && buttons[2][1].getText() == "o")
                ||(buttons[0][2].getText() == "o" && buttons[1][2].getText() == "o" && buttons[2][2].getText() == "o")
                ||(buttons[0][0].getText() == "o" && buttons[0][1].getText() == "o" && buttons[0][2].getText() == "o")
                ||(buttons[1][0].getText() == "o" && buttons[1][1].getText() == "o" && buttons[1][2].getText() == "o")
                ||(buttons[2][0].getText() == "o" && buttons[2][1].getText() == "o" && buttons[2][2].getText() == "o")){
            return "Нолики победили!";
        }
        else return "";
    }

    public void blockButtons(JButton[][] buttons){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(buttons[i][j].isEnabled())
                    buttons[i][j].setEnabled(false);
            }
        }
    }
}
