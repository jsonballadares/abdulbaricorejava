public class Validator {
    public static boolean validate(int age) {
        return age > 3 && age <= 15;
    }

    public static boolean validate(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }

    public static void main(String[] args) {
        System.out.println(validate("Jason Balladares"));
        System.out.println(validate(13));
    }
}
