package Sets;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class LearnSet {

    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("anuj", 2));
        studentSet.add(new Student("manish", 4));
        studentSet.add(new Student("karan", 6));

        studentSet.add(new Student("priya", 4));

        System.out.println(studentSet);

        Student s1 = new Student("Anuj", 2);
        Student s2 = new Student("Rohit", 2);

        System.out.println(s1.equals(s2));
        System.out.println(studentSet);

        // HashSet : This set give random number in output
        // Set<Integer> set = new HashSet<>();

        // LinkedListSet : This set give same sequenece number in output
        // Set<Integer> set = new LinkedHashSet<>();

        // TreeSet : This set sorts the element in output
        Set<Integer> set = new TreeSet<>();

        set.add(34);
        set.add(2);
        set.add(45);
        set.add(10);
        set.add(100);
        set.add(39);

        System.out.println(set);
        set.remove(45);

        System.out.println(set);

        System.out.println(set.contains(100));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println();



    }

}
