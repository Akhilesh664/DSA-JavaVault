package Extra;

import java.io.FileInputStream;

public class FileInputStreamExample_71 {

    public static void main(String[] args) {

        try{
            FileInputStream fin = new FileInputStream("D:\\testout.txt");

            // for print first character
//            int i = fin.read();
//            System.out.println((char)i);

            // 1 st way
//            for(int i = fin.read(); i != -1; i = fin.read()){
//                System.out.print((char)i);
//            }

            // 2 nd way
            while(fin.available()!=0){
                System.out.print((char)fin.read());
            }
            fin.close();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
