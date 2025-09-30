package Practise1;

public class Player {
    String name;
    int age;
    String countryName;
    int totalRun;

    public Player(String name, int age, String countryName, int totalRun) {
        this.name = name;
        this.age = age;
        this.countryName = countryName;
        this.totalRun = totalRun;
    }

    void displayElitePlayer(){
        if(totalRun >= 5000){
            System.out.println("name: "+name);
            System.out.println("age: "+age);
            System.out.println("countryName: "+countryName);
            System.out.println("totalRun: "+totalRun);
        }
    }

    public static void main(String[] args) {
        var p1 = new Player("sachin", 23, "india", 7000);
        p1.displayElitePlayer();
        System.out.println("==");

        var p2 = new Player("anil", 45, "uk", 2000);
        p2.displayElitePlayer();
        System.out.println("==");

        var p3 = new Player("mark", 24, "america", 0);
        p3.displayElitePlayer();
        System.out.println("==");

        var p4 = new Player("virat", 29, "india", 10000);
        p4.displayElitePlayer();
        System.out.println("==");

        var p5 = new Player("bean", 57, "china", 5000);
        p5.displayElitePlayer();
    }
}
