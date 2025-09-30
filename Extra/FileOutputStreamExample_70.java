package Extra;

import java.io.FileOutputStream;

// FileOutputStream: It is used for writing bytes to a file (output from your program → to a file).
public class FileOutputStreamExample_70 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
            fout.write(65);
            fout.write("hi akhilesh, Welcome to java".getBytes());
            fout.close();
            System.out.println("Success... by akhilesh");
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
