import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Panel() {
        setLayout(new GridLayout(3,3));
        JButton button = new JButton("Start");
        add(button);
    }
}
