package DesignPatterns;

public class Singleton {

    private static Singleton instance;

    private Singleton(){
        System.out.println("Singleton instance created");
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.showMessage();
        s2.showMessage();
        System.out.println(s1==s2);
    }
}
