package ExceptionHandling;

import java.io.*;

public class ThrowsExampleBasic {

    static void readFile() throws IOException { // Declaring exception
        FileReader file = new FileReader("nonexistent.txt");
        BufferedReader br = new BufferedReader(file);
        System.out.println(br.readLine());
    }

    public static void main(String[] args) {
        try {
            readFile(); // Calling method that declares an exception
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

}
