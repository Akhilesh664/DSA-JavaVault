package Extra;

class Language{
    private String name;

    // Default constructor
    Language(){
        System.out.println("Constructor method called.");
    }

    // Parameterized constructor
    Language(String t){
        name = t;
    }

    void setName(String t){
        name = t;
    }

    void getName(){
        System.out.println("Language name is "+ name);
    }
}

public class ConstructorOverloading_48 {
    public static void main(String[] args) {
        Language cpp = new Language();
        Language java = new Language("Java");

        cpp.setName("C++");

        java.getName();
        cpp.getName();
    }
}