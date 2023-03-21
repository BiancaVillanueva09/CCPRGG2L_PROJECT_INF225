import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
// import javax.swing.JOptionPane;
import javax.swing.JPanel;
// import javax.swing.plaf.basic.BasicBorders.ButtonBorder;


import java.awt.*;
// import java.io.IOException;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    MainMenu() {
        this.setLayout(new FlowLayout());

        ImageIcon icon = new ImageIcon("39-390182_transparent-candy-clipart-png-candy-bowl-clipart-png.png");

        JLabel label = new JLabel();
        label.setIcon(icon);
        label.setBackground(Color.white);
    
        JButton button = new JButton();
        button.setText("Start Game");
        button.setFont(new Font("Georgia", Font.BOLD, 50));
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setBackground(Color.white);

        EventHandler handler = new EventHandler();
        button.addActionListener(handler);


        JPanel panel1 = new JPanel();
        panel1.add(label);
        panel1.setBackground(Color.white);
        this.add(panel1); 

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.white);
        panel2.add(button);
        this.add(panel2);
    }


    private class EventHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            new DifficultyMenu();
            dispose();
        }
    }
}
