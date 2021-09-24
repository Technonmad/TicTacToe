import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameButtonController implements ActionListener {
    JButton button;
    Game game;
    public int flag = 1;
    public GameButtonController(JButton button) {
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
