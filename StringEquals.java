public class StringEquals {
    public static void main(String[] args) {
        String str1 = "the great wall of china";
        String str2 = new String("china all");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1 == str2);
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.contains("wall"));
        System.out.println(String.valueOf(123));
    }
}
