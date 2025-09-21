package Java_8;

//💡 Lambda Expressions: (🔹 Anonymous Functions) allow us to write concise and functional-style code without defining separate method implementations.
//💡 Uses: Lambda expressions help reduce boilerplate code by replacing anonymous classes. For example, in a user authentication system, instead of writing-
// -a full anonymous class for filtering active users, you can use it.

interface MathOperation {
    int operator(int a, int b);
}

public class LambdaExpressionExample_1 {
    public static void main(String[] args) {

        // With (LAMBDA Expression)
        MathOperation add = (a, b) -> a + b;
        System.out.println("Addition: "+add.operator(5, 3));

        MathOperation mul = (a, b) -> a * b;
        System.out.println("Multiplication: "+mul.operator(5, 3));


//        // Without (LAMBDA Expression)
//      MathOperation add = new MathOperation() {
//           @Override
//           public int operator(int a, int b) {
//               return a + b;
//           }
//      };
//      System.out.println("Addition: "+add.operator(5, 3));
    }
}
