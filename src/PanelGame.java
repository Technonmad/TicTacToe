import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.EventListener;

public class PanelGame extends JPanel {

    JLabel label = new JLabel();
    JButton[][] buttons = new JButton[3][3];

    public PanelGame(){

        enableEvents(AWTEvent.MOUSE_EVENT_MASK);

        for (int i = 0; i < buttons.length; i++){
            for (int j = 0; j < buttons.length; j++){
                buttons[i][j] = new JButton();
                buttons[i][j].setBounds(70 + j * 50,50 + i * 50,50,50);
                buttons[i][j].addActionListener(new GameButtonController(buttons[i][j]));
                add(buttons[i][j]);
                //можно поставить метки getActionComment
            }
        }

        add(label);
        setLayout(null);

        label.setBounds(105,0, 200,200);

    }

    public void updateLabel(String text){
        label.setText(text);
    }

}
