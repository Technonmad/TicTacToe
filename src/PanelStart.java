import javax.swing.*;
import java.awt.*;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelStart extends JPanel {
    public PanelStart(JFrame frame, PanelGame panelGame, Container container) {
        JButton button = new JButton("Start");
        JLabel label = new JLabel("Крестики - нолики");

        add(label);
        add(button);
        setLayout(null);
        button.setBounds(105,115, 100, 30);
        button.addActionListener(new MainMenuController(frame, panelGame, container));
        label.setBounds(100,0, 200,200);
    }

}
