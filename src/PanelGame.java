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
    JButton restartButton = new JButton();
    Game game = Game.getInstance();
    Container container;

    public PanelGame(){

        enableEvents(AWTEvent.MOUSE_EVENT_MASK);

        for (int i = 0; i < buttons.length; i++){
            for (int j = 0; j < buttons.length; j++){
                buttons[i][j] = new JButton();
                buttons[i][j].setBounds(70 + j * 50,50 + i * 50,50,50);
                buttons[i][j].addActionListener(new GameButtonController(buttons[i][j], this, container));
                add(buttons[i][j]);
                //можно поставить метки getActionComment
            }
        }

        //restartButton.setBounds(105,115, 100, 30);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBounds(70,220, 150,20);
       // restartButton.

        add(label);
        setLayout(null);
    }

    public void updateLabel(String text){
        label.setText(text);
    }

}
