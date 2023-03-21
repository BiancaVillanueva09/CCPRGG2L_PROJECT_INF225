import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class PlayerMenu extends JFrame {
    JTextField textfield;
    PlayerMenu() {
        super("Candy Rush");
        this.setLayout(new FlowLayout());

        JLabel label = new JLabel();
        label.setText("Enter your name:");
        label.setFont(new Font("Georgia", Font.PLAIN, 20));

        textfield = new JTextField(20);

        EventHandler handler = new EventHandler();
        textfield.addKeyListener(handler);

        this.add(label);
        this.add(textfield);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 250);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.gray);
    }
    
    private class EventHandler implements KeyListener {
        public void keyPressed(KeyEvent event) {
            CandyRush gp = new CandyRush();
            if (event.getKeyCode() == KeyEvent.VK_ENTER) {
            gp.playerName = textfield.getText();
            dispose();
            new GameFrame();
            }
        }
        public void keyTyped(KeyEvent event) {
        }
        public void keyReleased(KeyEvent event) {
        }
    }
}
