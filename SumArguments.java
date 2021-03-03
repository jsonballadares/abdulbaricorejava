public class SumArguments {
    public static void main(String[] args) {
        int sum = 0;
        for (String s : args) {
            if (s.matches("[0-9\\.]+"))
                sum += Double.parseDouble(s);
        }
        System.out.println("Sum: " + sum);
    }
}
