import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelStart extends JPanel {
    public PanelStart() {
        JButton button = new JButton("Start");
        JLabel label = new JLabel("Крестики - нолики");
        GameFrame gameFrame = new GameFrame();
        Actions btnAction = new Actions();

        add(label);
        add(button);
        setLayout(null);
        button.setBounds(105,115, 100, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                gameFrame.setVisible(true);
            }
        });
        label.setBounds(100,0, 200,200);
    }

}
