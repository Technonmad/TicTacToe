import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panels extends JPanel {
    public Panels() {
        JButton button = new JButton("Start");
        JLabel label = new JLabel("Крестики - нолики");
        Actions btnAction = new Actions();

        add(label);
        add(button);
        setLayout(null);
        button.setBounds(105,115, 100, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            }
        });
        label.setBounds(100,0, 200,200);
    }
    public GamePanel(){
        
    }
}
