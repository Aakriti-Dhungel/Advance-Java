package filehandlingobjectstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws Exception {
        // Step 1: Save (Serialize) Student object to file

        Student s = new Student("Aakriti", 30); // Create a student object

        // Open file to write object
        FileOutputStream fos = new FileOutputStream("objfile.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s); // Save the object to file

        oos.close();
        fos.close();

        System.out.println("Student object saved to file.");
        // Step 2: Read (Deserialize) Student object from file
        FileInputStream fis = new FileInputStream("objfile.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s1 = (Student) ois.readObject(); // Read the object

        System.out.println("Student object read from file:");
        s1.display(); // Display the details

        ois.close();
        fis.close();
    }
}
