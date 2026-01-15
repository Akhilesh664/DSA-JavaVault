package CollectionFramework.HashMap;

import java.util.HashMap;
import java.util.WeakHashMap;


// 1). [NOTE] : WeakHashMap is a HashMap which uses weak/strong references to the keys, WeakHashMap support garbage collection.
//class A {
//
//    public A() {}
//
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//        System.out.println("Finalize method of A");
//    }
//
//    @Override
//    public String toString() {
//        return "a";
//    }
//}
//
//public class WeakHashMapDriver extends A {
//
//    public static void main(String[] args) {
//
//        A a = new A();
//        WeakHashMap<A, String> whmap = new WeakHashMap<>();
//
//        whmap.put(a, "aa");
//
//        System.out.println("Before GC: " + whmap);
//        a = null;              // remove strong reference
//        System.gc();           // request GC
//
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//        System.out.println("After GC: " + whmap);
//        System.out.println("[NOTE]: Change/ Memory garbage collection happens in Value as WeakHashMap store Key loosely reference");
//
//    }
//}


// 2). [NOTE] : HashMap uses Strong references, i.e. It hold strong references to the keys, and HashMap dont support garbage collection.
class B {

    public B() {}

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finalize method of B");
    }


    @Override
    public String toString() {
        return "b";
    }
}

public class WeakHashMapDriver extends B {
    public static void main(String[] args) {

        B b = new B();
        HashMap<B, String> hmap = new HashMap<>();

        hmap.put(b, "bbbb");

        System.out.println("Before GC: " + hmap);
        b = null;              // remove strong reference
        System.gc();           // request GC

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println("After GC: " + hmap);
        System.out.println("[NOTE]: NO Change/No memory garbage collection happens in Value as HashMap store Key strong reference");


    }
}