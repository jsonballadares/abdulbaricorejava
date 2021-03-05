import java.util.Scanner;

public class Email {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();
        if (email.toLowerCase().contains("@gmail.com")) {
            System.out.println(email + " is a gmail");
        }

        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println("username: " + username);
        System.out.println("domain: " + domain);

        scanner.close();
    }
}
