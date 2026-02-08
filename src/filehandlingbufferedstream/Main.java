package filehandlingbufferedstream;
/*
LAB–3
File Handling using Buffered Stream (BufferedInputStream & BufferedOutputStream)
*/

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) throws Exception { // declare throws Exception
        // Data to write (ASCII of 'A')
        int data = 65;

        // Writing data to file using BufferedOutputStream
        FileOutputStream fos = new FileOutputStream("bufferedfile.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(data); // write single byte
        bos.close(); // flushes automatically
        fos.close();

        // Reading data from file using BufferedInputStream
        FileInputStream fis = new FileInputStream("bufferedfile.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int readData = bis.read(); // reads a single byte
        System.out.println("Data read from file: " + readData); // prints 65
        bis.close();
        fis.close();
    }
}
