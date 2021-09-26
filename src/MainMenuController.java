import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuController implements ActionListener {
    JFrame frame;
    Container container;
    PanelGame panelGame;

    public MainMenuController(JFrame frame, PanelGame panelGame, Container container){
        this.frame = frame;
        this.container = container;
        this.panelGame = panelGame;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        container.removeAll();
        frame.repaint();
        container.add(panelGame);
        frame.revalidate();

    }
}
