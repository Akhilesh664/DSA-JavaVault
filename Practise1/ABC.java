package Practise1;

/**
 * ABC.java
 * 
 * This class is a demonstration of common Java programming mistakes and concepts.
 * It's used for educational purposes to illustrate proper Java syntax and best practices.
 * 
 * This is a standalone class in the Practise1 package and doesn't have any direct
 * relationships with other classes in the package.
 * 
 * Note: This class contains intentional errors for demonstration purposes.
 * It's used to learn about:
 * - Proper constructor declaration (no return type)
 * - Static variable declaration (class level vs method level)
 * - Constructor overloading and default constructors
 */
//public class ABC {
//
//    // ❌ This is NOT a constructor; it's just a method.
//    // Constructors do NOT have a return type. Writing 'void' makes it a normal method.
//    void ABC(){
//        c = 5;
//    }
//
//    // Constructor with one argument
//    ABC(int x){
//        c = x; // ❌ 'c' does not exist as a class-level static variable
//    }
//
//    public static void main(String[] args) {
//        // ❌ ERROR: You cannot declare a static variable inside a method.
//        // Static variables must be at the class level.
//         public static int c = 0;
//
//        // ❌ ERROR: There is no default (no-arg) constructor available.
//        // The only constructor available is ABC(int x).
//        ABC a = new ABC();
//
//        // ❌ ERROR: 'c' does not exist in this scope due to the previous static declaration issue
//        System.out.println(c);
//    }
//
//}
