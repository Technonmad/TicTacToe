import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameButtonController implements ActionListener {
    JButton button;
    PanelGame panelGame;
    private Game game = Game.getInstance();
    Container container;

    public GameButtonController(JButton button, PanelGame panelGame, Container container) {
        this.button = button;
        this.panelGame = panelGame;
        this.container = container;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        button.setText(game.getPlayerSign());
        button.setEnabled(false);
        if(game.checkFreeSpace(panelGame.buttons) == false){
            panelGame.label.setText("Ничья!");
            panelGame.add(panelGame.retryButton);
        }
        game.swapPlayers();
    }
}
