package Part4;

public class InitializationOrder {
	static int staticVar = 10;
    int instanceVar = 20;

    static {
        System.out.println("Static Block: staticVar = " + staticVar);
    }

    {
        System.out.println("Instance Block: instanceVar = " + instanceVar);
    }

    InitializationOrder() {
        System.out.println("Constructor: instanceVar = " + instanceVar);
    }

    public static void main(String[] args) {
        InitializationOrder obj = new InitializationOrder();
    }
}

/* Output:
Static Block: staticVar = 10
Instance Block: instanceVar = 20
Constructor: instanceVar = 20
*/
