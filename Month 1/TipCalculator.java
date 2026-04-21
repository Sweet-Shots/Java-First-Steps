import java.util.Scanner;  // lets us read what the user types

public class TipCalculator {  // the class name must match the file name
    public static void main(String[] args) {  // this is where the program starts
        Scanner scanner = new Scanner(System.in);  // tool to read user input

        double bill;  // the total bill amount
        int choice;  // which tip option they want
        double customTip;  // for custom tip percentage

        System.out.println("--- Tip Calculator ---");  // print title
        System.out.println("Please pick a tiping option.");  // prompt
        System.out.println("1. 5%");  // show option 1
        System.out.println("2. 10%");  // show option 2
        System.out.println("3. 15%");  // show option 3
        System.out.println("4. Custom");  // show option 4

        System.out.print("Choice (1-4): ");  // ask for their choice
        choice = scanner.nextInt();  // save what they typed

        System.out.print("Please input the bill amount (ex: 2.00): ");  // ask for bill
        bill = scanner.nextDouble();  // save what they typed

        if (choice == 1) {  // if they chose 1 (5%)
            calculateTip(bill, 0.05);  // call the method with 5% tip
        } else if (choice == 2) {  // if they chose 2 (10%)
            calculateTip(bill, 0.10);  // call the method with 10% tip
        } else if (choice == 3) {  // if they chose 3 (15%)
            calculateTip(bill, 0.15);  // call the method with 15% tip
        } else if (choice == 4) {  // if they chose 4 (custom)
            System.out.print("Please input a custom tip amount: ");  // ask for custom %
            customTip = scanner.nextDouble();  // save what they typed (e.g., 20 for 20%)
            calculateTip(bill, customTip);  // call method with their custom %
        } else {  // if they typed something else
            System.out.println("Invalid choice, restart program.");  // tell them
        }

        scanner.close();  // clean up the scanner when done
    }

    public static void calculateTip(double bill, double tipPercent) {  // method to calc tip
        double tip = bill * tipPercent;  // calculate tip from bill and percentage
        double total = bill + tip;  // add tip to bill for total
        System.out.println("");
        System.out.println("--- Total ---");  // print header
        System.out.println("Bill: $" + bill);  // show original bill
        System.out.println("Tip: $" + tip);  // show tip amount
        System.out.println("Total: $" + total);  // show final total (bill + tip)
    }
}