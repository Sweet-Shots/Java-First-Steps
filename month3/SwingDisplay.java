/*
 * ⚠️ FULLY AI-GENERATED FILE ⚠️
 *
 * This entire file was generated using AI as part of my Java learning process.
 *
 * It is included for:
 * - Understanding how Java code is structured
 * - Learning how logic and syntax work in practice
 * - Comparing future improvements against generated examples
 *
 * This file may be replaced or rewritten later with my own implementation.
 */

package month3;

import javax.swing.JFrame;  // the window
import javax.swing.JButton;  // a clickable button
import javax.swing.JTextField;  // a box that can show text (our "screen")
import javax.swing.JPanel;  // a container that holds many buttons
import java.awt.BorderLayout;  // lets us place things top/bottom/center
import java.awt.GridLayout;  // arranges things in a grid of rows and columns

public class SwingDisplay {  // the class name must match the file name
    public static void main(String[] args) {  // this is where the program starts
        JFrame window = new JFrame("Display Example");  // make the window
        JTextField screen = new JTextField();  // make the text box (the display)
        JPanel buttons = new JPanel();  // make a container to hold the buttons
        buttons.setLayout(new GridLayout(2, 2));  // arrange them in a 2-row, 2-column grid

        JButton one = new JButton("1");  // each button is its own object
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");

        // each click adds that number to the END of the current screen text
        one.addActionListener(e -> screen.setText(screen.getText() + "1"));  // getText reads what's there now
        two.addActionListener(e -> screen.setText(screen.getText() + "2"));
        three.addActionListener(e -> screen.setText(screen.getText() + "3"));
        four.addActionListener(e -> screen.setText(screen.getText() + "4"));

        buttons.add(one);  // add each button to the PANEL (not the window)
        buttons.add(two);
        buttons.add(three);
        buttons.add(four);

        window.add(screen, BorderLayout.NORTH);  // put the display at the top
        window.add(buttons, BorderLayout.CENTER);  // put the whole grid of buttons in the center

        window.setSize(300, 200);  // set window size (width, height)
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // closing ends the program
        window.setVisible(true);  // show the window on screen
    }
}
