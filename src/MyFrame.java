import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setSize(300,300);
        setTitle("TicTacToe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Game game = Game.getInstance();

        Container container = getContentPane();
        PanelGame panelGame = new PanelGame();
        PanelStart panelStart = new PanelStart(this, panelGame, container);
        container.add(panelStart);

    }
}
