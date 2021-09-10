import javax.swing.*;
import java.awt.*;

public class GameGrid extends JFrame {
    public GameGrid() throws HeadlessException {
        setSize(300,300);
        setVisible(true);
    }
    public void paint(Graphics g){
        g.drawRect(10,10,10,10);
    }
}
