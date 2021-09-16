import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    public GameFrame() throws HeadlessException {
        setSize(300,300);
        setTitle("TicTacToe");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        Container container = getContentPane();
        PanelGame panelGame = new PanelGame();
        container.add(panelGame);
        panelGame.setVisible(true);
    }
}
