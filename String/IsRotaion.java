package String;

public class IsRotaion {
    public static void main(String[] args) {
        // Test isRotation
        String rotationS1 = "waterbottle";
        String rotationS2 = "erbottlewat";
        System.out.println("Is '" + rotationS2 + "' a rotation of '" + rotationS1 + "'? " + isRotation(rotationS1, rotationS2));

    }

    // 3. Check if one string is a rotation of another
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        return (s1 + s1).contains(s2);
    }
}
