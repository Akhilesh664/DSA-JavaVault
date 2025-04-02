package HashMap;

//💡 HashMap (Unordered Key-Value Storage) provides constant-time performance (O(1)) for operations like put(), get(), and remove(), but it does not maintain any order.

import java.util.*;

public class HashMapExample1 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Akhilesh",85);
        studentMarks.put("Ravi", 90);
        studentMarks.put("Priya", 78);
        studentMarks.put("Amit", 92);


        String topStudent = "";
        int maxMarks = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()){
            if(entry.getValue() > maxMarks){
                maxMarks = entry.getValue();
                topStudent = entry.getKey();
            }
        }

        System.out.println("Top Student: " + topStudent + " with Marks: " + maxMarks);
    }
}
