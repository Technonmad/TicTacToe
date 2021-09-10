import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame() {
        setSize(300,300);
        setTitle("TicTacToe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = getContentPane();
        Panels panels = new Panels();
        container.add(panels);
    }
}
