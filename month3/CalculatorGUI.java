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
import javax.swing.JTextField;  // the display (our "screen")
import javax.swing.JPanel;  // a container that holds many buttons
import java.awt.BorderLayout;  // lets us place things top/bottom/center
import java.awt.GridLayout;  // arranges buttons in a grid
import java.awt.Font;  // lets us make text bigger
import java.awt.Dimension;  // lets us set a size (width, height)

public class CalculatorGUI {  // the class name must match the file name

    JTextField screen = new JTextField();  // the display at the top
    double firstNumber = 0;  // the number typed before an operator
    String pendingOp = "";  // the operator we're waiting to use (+ - * /)
    boolean startNew = true;  // true when the next digit should start a fresh number

    public static void main(String[] args) {  // this is where the program starts
        new CalculatorGUI().buildWindow();  // make a calculator object, then build its window
    }

    public void buildWindow() {  // sets up and shows the whole calculator
        JFrame window = new JFrame("Calculator");  // make the window

        screen.setEditable(false);  // stop the user typing directly into the display
        screen.setHorizontalAlignment(JTextField.RIGHT);  // numbers line up on the right, like a real calculator
        screen.setFont(new Font("SansSerif", Font.PLAIN, 32));  // big display text
        screen.setPreferredSize(new Dimension(300, 80));  // make the display nice and tall

        JPanel buttons = new JPanel();  // container for all the buttons
        buttons.setLayout(new GridLayout(4, 4, 5, 5));  // 4x4 grid with 5px gaps between buttons

        // the label on each button, laid out in reading order (fills the grid row by row)
        String[] labels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String label : labels) {  // make one button for each label
            JButton b = new JButton(label);  // create the button
            b.setFont(new Font("SansSerif", Font.PLAIN, 18));  // readable button text
            b.addActionListener(e -> handleClick(label));  // when clicked, run handleClick with this label
            buttons.add(b);  // add it to the grid
        }

        window.add(screen, BorderLayout.NORTH);  // display goes on top
        window.add(buttons, BorderLayout.CENTER);  // button grid fills the rest
        window.setSize(320, 420);  // window size (width, height)
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // closing ends the program
        window.setVisible(true);  // show the window on screen
    }

    public void handleClick(String label) {  // decides what to do based on which button was pressed
        if ("0123456789".contains(label)) {  // a number button
            if (startNew) {  // starting a fresh number?
                screen.setText(label);  // replace whatever was there
                startNew = false;  // now we're building a number
            } else {
                screen.setText(screen.getText() + label);  // add this digit onto the end
            }
        }
        else if (label.equals("C")) {  // clear button
            screen.setText("");  // wipe the display
            firstNumber = 0;  // reset saved number
            pendingOp = "";  // reset saved operator
            startNew = true;  // ready for a fresh number
        }
        else if (label.equals("=")) {  // equals button
            if (pendingOp.equals("")) {return;}  // nothing to calculate yet
            double second = currentNumber();  // read the second number off the screen
            double result = calculate(firstNumber, second, pendingOp);  // do the math
            screen.setText(format(result));  // show the answer
            pendingOp = "";  // we're done with the operator
            startNew = true;  // next digit starts fresh
        }
        else {  // an operator: + - * /
            firstNumber = currentNumber();  // save the number we've typed so far
            pendingOp = label;  // remember which operator was pressed
            startNew = true;  // next digit starts the second number
        }
    }

    public double currentNumber() {  // reads the display as a number (0 if empty)
        String text = screen.getText();  // whatever is on the screen
        if (text.equals("")) {return 0;}  // empty means 0
        return Double.parseDouble(text);  // turn the text into a number
    }

    public double calculate(double a, double b, String op) {  // does the actual math
        if (op.equals("+")) {return a + b;}  // add
        if (op.equals("-")) {return a - b;}  // subtract
        if (op.equals("*")) {return a * b;}  // multiply
        if (op.equals("/")) {  // divide
            if (b == 0) {return 0;}  // avoid dividing by zero
            return a / b;
        }
        return b;  // fallback (shouldn't happen)
    }

    public String format(double d) {  // makes whole numbers show without ".0"
        if (d == Math.floor(d)) {return String.valueOf((long) d);}  // 12.0 becomes "12"
        return String.valueOf(d);  // 12.5 stays "12.5"
    }
}
