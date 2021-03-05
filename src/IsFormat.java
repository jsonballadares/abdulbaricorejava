public class IsFormat {
    public static void main(String[] args) {
        int b = 10110201;
        String binary = String.valueOf(b);
        boolean isBinary = binary.matches("[01]+");
        if (isBinary) {
            System.out.println(binary + " is binary: " + isBinary);
        } else {
            System.out.println(binary + " is not binary.");
        }
        String hexString = "0AF12";
        boolean isHex = hexString.matches("[0-9A-F]+");
        if (isHex) {
            System.out.println(hexString + " is hexadecimal: " + isHex);
        } else {
            System.out.println(hexString + " is not hexadecimal.");
        }

        String date = "01/12/2000";
        boolean isFormat = date.matches("[0-3][0-9][/][0-1][0-9][/][0-9]{4}");
        if (isFormat) {
            System.out.println(date + " is in the correct format.");
        } else {
            System.out.println(date + " is in the incorrect format.");
        }

    }
}
