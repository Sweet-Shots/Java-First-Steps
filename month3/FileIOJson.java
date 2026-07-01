package month3;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import com.google.gson.Gson;

public class FileIOJson {
    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();
        ArrayList<Entry> entries = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        printScreen(gson);  // show past entries
        System.out.print("> ");  // prompt symbol
        String inputEntry = scanner.nextLine();  // save what they typed

        if (checkFileExsists()) {  // if we already have saved entries
            Entry[] old = gson.fromJson(new FileReader("journal.json"), Entry[].class);  // read them all as an array
            if (old != null) { for (Entry x : old) entries.add(x); }  // copy each old one into our list
        }

        entries.add(new Entry(inputEntry));  // add the brand-new entry to the list

        PrintWriter writer = new PrintWriter("journal.json");  // open the file (this overwrites it)
        writer.println(gson.toJson(entries));  // write the WHOLE list back (old + new)
        writer.close();  // close so it actually saves

        scanner.close();  // clean up the scanner when done
    }

    public static void printScreen(Gson gson) throws Exception {
        System.out.println("Welcome to your journal!");
        System.out.println("Below you can view your past entries");
        System.out.println("----------------------------");
        if (checkFileExsists() == true) {
            Entry[] all = gson.fromJson(new FileReader("journal.json"), Entry[].class);  // read every entry as an array
            if (all != null) {  // make sure the file wasn't empty
                for (Entry x : all) {System.out.println(x.text);}  // print each entry's text
            }
        } else {System.out.println("Well... theres nothing here :P");}
        System.out.println("----------------------------");
        System.out.println("Please type in a new entry!");
    }

    public static boolean checkFileExsists() {
        File file = new File ("journal" + ".json");
        if (file.exists()) {return true;}
        else {return false;}
    }

    static class Entry {
        String text;
        Entry(String text) {this.text = text;}
    }


}
