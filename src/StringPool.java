package src;

public class StringPool {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("Java");

        if (str1 == str2) {
            System.out.println("Referencing the same string");
        } else {
            System.out.println("Referencing the different string");
        }
    }
}
