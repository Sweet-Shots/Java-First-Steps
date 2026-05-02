package Month_1;

import java.util.Scanner;  // lets us read what the user types

public class BMICalculator {  // the class name must match the file name
    public static void main(String[] args) {  // this is where the program starts
        Scanner scanner = new Scanner(System.in);  // tool to read user input

        double weight;  // how much they weigh in kg
        double height;  // how tall they are in meters
        double BMI;  // the calculated BMI value

        System.out.println("--- BMI Calculator ---");  // print title
        System.out.print("Please put in your weight (kg): ");  // ask for weight
        weight = scanner.nextDouble();  // save what they typed

        System.out.print("Please put in your height (m): ");  // ask for height
        height = scanner.nextDouble();  // save what they typed

        BMI = weight / (height * height);  // calculate BMI using the formula

        String BMICatagory;  // holds the BMI category name
        System.out.println("Your BMI is: " + BMI);  // show the BMI result

        if (BMI < 18.5) {  // if BMI is less than 18.5
            BMICatagory = "Underweight";  // set category to underweight
            System.out.println("Your BMI Catagory is: " + BMICatagory);  // show category
        } else if (BMI >= 18.5 && BMI <= 24.9) {  // if BMI is between 18.5 and 24.9
            BMICatagory = "Normal";  // set category to normal
            System.out.println("Your BMI Catagory is: " + BMICatagory);  // show category
        } else if (BMI >= 25 && BMI <= 29.9) {  // if BMI is between 25 and 29.9
            BMICatagory = "Overweight";  // set category to overweight
            System.out.println("Your BMI Catagory is: " + BMICatagory);  // show category
        } else if (BMI >= 30) {  // if BMI is 30 or higher
            BMICatagory = "Obese";  // set category to obese
            System.out.println("Your BMI Catagory is: " + BMICatagory);  // show category
        }


        scanner.close();  // clean up the scanner when done
    }
}
