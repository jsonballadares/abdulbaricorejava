public class TypeOfWebsiteSwitch {
    public static void main(String[] args) {
        String url = "www.google.com";
        String type = url.substring(url.lastIndexOf(".") + 1);
        switch (type) {
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Orginization");
                break;
            case "net":
                System.out.println("Network");
                break;
            case "gov":
                System.out.println("Goverment");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
