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

public class SwingHello {  // the class name must match the file name
    public static void main(String[] args) {  // this is where the program starts
        JFrame window = new JFrame("My First Window");  // make the window (title shows in the bar)
        JButton button = new JButton("Click me!");  // make a button with this label

        button.addActionListener(e -> System.out.println("You clicked it!"));  // when clicked, run this line

        window.add(button);  // put the button inside the window
        window.setSize(300, 200);  // set window size (width, height in pixels)
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // closing the window ends the program
        window.setVisible(true);  // actually show the window on screen
    }
}
