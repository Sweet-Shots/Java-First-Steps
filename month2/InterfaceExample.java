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

package month2;

// The Drawable interface defines what any shape must be able to do
interface Drawable {
    void draw();  // method that all shapes must have
}

// Circle implements Drawable, so it must provide a draw() method
class Circle implements Drawable {
    public void draw() {  // the required draw method
        System.out.println("Drawing a circle!");  // print circle action
    }
}

// Square implements Drawable, so it must also provide a draw() method
class Square implements Drawable {
    public void draw() {  // the required draw method
        System.out.println("Drawing a square!");  // print square action
    }
}

public class InterfaceExample {  // the main class
    public static void main(String[] args) {  // program start point
        Drawable myCircle = new Circle();  // create a circle
        Drawable mySquare = new Square();  // create a square

        myCircle.draw();  // call circle's draw method
        mySquare.draw();  // call square's draw method
    }
}
