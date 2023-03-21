import java.awt.Color;

public class App {
    public static void main(String[] args) throws Exception {
        MainMenu Main_Menu = new MainMenu();
        Main_Menu.setDefaultCloseOperation(Main_Menu.EXIT_ON_CLOSE);
        Main_Menu.setSize(1000, 600);
        Main_Menu.setVisible(true);
        Main_Menu.setLocationRelativeTo(null);
        Main_Menu.setResizable(true);
        Main_Menu.getContentPane().setBackground(Color.pink);
    }
}
