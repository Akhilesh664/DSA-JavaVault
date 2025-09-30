package Extra;

public class GarbageCollection_57 {

    public static void main(String[] args) {

        Runtime rs = Runtime.getRuntime();
        System.out.println("Free memory in JVM before garbage collection : "+rs.freeMemory());
        rs.gc();
        System.out.println("Free memory in JVM after garbage collection : "+rs.freeMemory());
    }
}
 