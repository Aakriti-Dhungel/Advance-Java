package filehandlingcharacterstream;

import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) throws Exception { // throws declaration
        // Data to write
        char ch = 'A'; // character instead of int

        // Writing data to file using FileWriter
        FileWriter writer = new FileWriter("textfile.txt");
        writer.write(ch);
        writer.close(); // always close writer

        // Reading data from file using FileReader
        FileReader reader = new FileReader("textfile.txt");
        int data = reader.read(); // reads a single character as int
        System.out.println("Data read from file: " + (char) data);
        reader.close();
    }
}
