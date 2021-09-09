import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame() {
        setSize(500,500);
        setTitle("TicTacToe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = getContentPane();
        Panel panel = new Panel();
        container.add(panel, BorderLayout.CENTER );
    }
}
