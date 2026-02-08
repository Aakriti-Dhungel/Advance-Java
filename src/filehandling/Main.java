//File Handling using Byte Stream (FileInputStream & FileOutputStream)
package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;

public class Main {

	public static void main(String args[]) throws Exception {

        int x = 5;

        // Write data to file
        FileOutputStream fo = new FileOutputStream("example.txt");
        fo.write(x);
        fo.close();

        // Read data from file
        FileInputStream fi = new FileInputStream("example.txt");
        int y = fi.read();
        System.out.println(y);
        fi.close();
    }
	// Serializable is markable interface -- it converts objects to stream
	// Main implements Serializable 
}
