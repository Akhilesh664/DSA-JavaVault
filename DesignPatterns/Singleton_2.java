package DesignPatterns;

public class Singleton_2 {
    private static Singleton_2 instance = new Singleton_2();

    private Singleton_2() {
        System.out.println("Singleton instance created");
    }

    public static Singleton_2 getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Singleton_2 s1 = Singleton_2.getInstance();
        Singleton_2 s2 = Singleton_2.getInstance();
        s1.showMessage();
        s2.showMessage();
        System.out.println(s1 == s2);
    }
}
