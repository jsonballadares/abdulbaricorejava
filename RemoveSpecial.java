public class RemoveSpecial {
    public static void main(String[] args) {
        String str = "     a!b@c     #1     $2%3";
        for (String s : str.trim().split("[\\s]+")) {
            System.out.println(s);
        }
        str = str.trim().replaceAll("\\W", "");
        System.out.println(str);
    }
}
