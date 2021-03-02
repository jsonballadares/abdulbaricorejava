import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your starting number?: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("What is your common ratio number?: ");
        double r = scanner.nextInt();
        scanner.nextLine();
        System.out.print("How many terms do you desire?: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int sum = a;
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.println(sum);
            } else {
                System.out.print(sum + ",");
            }

            sum *= r;
        }
        scanner.close();
    }
}
