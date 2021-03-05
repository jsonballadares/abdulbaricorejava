package src;

import javax.management.openmbean.SimpleType;

public class StringPractice {
    public static void main(String[] args) {
        String str1 = "Java Program";
        String str2 = new String("JAVA");
        char c[] = { 'H', 'E', 'L', 'L', 'O' };
        String str3 = new String(c);
        byte[] b = { 65, 66, 67, 68 };
        String str4 = new String(b);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        String str = new String("   netbeans     ");
        int len = str.length();
        System.out.println(len);
        String upper = str.toUpperCase();
        str = str.trim();
        System.out.println(str);
        System.out.println(upper);
        str2 = str.substring(3);
        System.out.println(str2);
        str2 = str.substring(3, 7);
        System.out.println(str2);
        str2 = str.substring(3, 5);
        System.out.println(str2);

        String name = "Mr. Shahrukh Khan";
        System.out.println(name.endsWith("Khan"));
        System.out.println(name.charAt(4));

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        String url = "www.udemy.co.in";
        System.out.println(url.indexOf("."));

    }
}
