import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame() {
        setSize(300,300);
        setTitle("TicTacToe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = getContentPane();
        Panel panel = new Panel();
        container.add(panel, BorderLayout.CENTER );

        PanelStart panelStart = new PanelStart();
        container.add(panelStart);
        panelStart.setVisible(true);

    }
}
