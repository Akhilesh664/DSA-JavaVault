package HashTable;

//💡 Hashtable (Thread-Safe, Unordered) is synchronized, making it thread-safe but slower than HashMap.

import java.util.*;

public class HashTableExample1 {

    public static void main(String[] args) {

        Hashtable<String, String> logins = new Hashtable<>();

        logins.put("admin", "secureAdminPass");
        logins.put("user1", "pass123");
        logins.put("user2", "strongPass");

        System.out.println("Stored Logins: " + logins);

    }

}
