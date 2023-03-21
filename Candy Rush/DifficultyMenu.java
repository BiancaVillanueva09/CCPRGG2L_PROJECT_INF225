import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DifficultyMenu extends JFrame {
    DifficultyMenu() {
        super("CandyRush");
        setBackground(Color.BLACK);
        this.setLayout(new FlowLayout());

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,250);
        this.setLocationRelativeTo(null);
        setBackground(Color.white);

        this.setLayout(new FlowLayout());

        JButton easyButton = new JButton();
        easyButton.setText("Easy");
        easyButton.setFont(new Font("Georgia", Font.PLAIN, 20));
        easyButton.setBackground(Color.WHITE);

        EventHandler easyhandler = new EventHandler(5);
        easyButton.addActionListener(easyhandler);

        JButton mediumButton = new JButton();
        mediumButton.setText("Medium");
        mediumButton.setFont(new Font("Georgia", Font.PLAIN, 20));
        mediumButton.setBackground(Color.white);

        EventHandler mediumhandler = new EventHandler(3);
        mediumButton.addActionListener(mediumhandler);

        JButton hardButton = new JButton();
        hardButton.setText("Hard");
        hardButton.setFont(new Font("Georgia", Font.PLAIN, 20));
        hardButton.setBackground(Color.white);

        EventHandler hardhandler = new EventHandler(1);
        hardButton.addActionListener(hardhandler);



        this.add(easyButton);
        this.add(mediumButton);
        this.add(hardButton);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 250);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.cyan);
    }

    private class EventHandler implements ActionListener {

        int playerlife;

        EventHandler(int lifelimit) {
            this.playerlife = lifelimit;
        }

        public void actionPerformed(ActionEvent event) {
            CandyRush candyrush = new CandyRush();
            candyrush.life = this.playerlife;
            dispose();
            new BGColorMenu();
        }
    }
}
