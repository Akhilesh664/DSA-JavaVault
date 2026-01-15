package CollectionFramework.Vector;

// 💡 Vector is a thread-safe resizable array implementation similar to ArrayList, but with synchronized methods, making it slower in single-threaded environments.

import java.util.ArrayList;
import java.util.Vector;

public class VectorToArrayList {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("java");
        vector.add("python");
        vector.add("c++");

        ArrayList<String> list = new ArrayList<>(vector);
        System.out.println("Converted Arraylist: "+list);
    }

}
