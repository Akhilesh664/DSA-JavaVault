package Part4;

public class Comparison {
	static void displayStatic() {
        System.out.println("Static display method");
    }

    void displayInstance() {
        System.out.println("Instance display method");
    }

    public static void main(String[] args) {
        Comparison.displayStatic(); // Called without an instance

        Comparison obj = new Comparison();
        obj.displayInstance(); // Requires an instance to call
    }
}

