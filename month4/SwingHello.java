package month4;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;

public class SwingHello {
    public static void main(String[] args) {
        JFrame window = new JFrame("This is the window name");
        JButton button = new JButton("This is a button");
        JTextField screen = new JTextField();

        button.addActionListener(e -> {
            System.out.println("Well... this is the action");
            screen.setText("Wow");
        });
        screen.setEditable(false);

        window.add(button, BorderLayout.CENTER);
        window.add(screen, BorderLayout.NORTH);
        window.setSize(500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
