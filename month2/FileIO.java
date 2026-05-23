package month2;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class FileIO {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input File Name: ");
        String fileName = scanner.nextLine();
        System.out.print("Please input a Message: ");
        String message = scanner.nextLine();
        PrintWriter writer = new PrintWriter("C:\\Users\\ducki\\Desktop\\" + fileName + ".txt");
        writer.println(message);
        writer.close();

        System.out.println("Saved to desktop.");

        File file = new File("C:\\Users\\ducki\\Desktop\\" + fileName + ".txt");
        Scanner fileReader = new Scanner(file);
        String readBack = fileReader.nextLine();
        fileReader.close();

        System.out.println("Read what you said: " + readBack);
        scanner.close();
    }
}
