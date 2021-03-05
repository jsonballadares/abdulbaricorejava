package src;

public class TypeOfWebsite {
    public static void main(String[] args) {
        String url = "http://www.google.com";

        String protocol = url.substring(0, url.indexOf("://"));
        if (protocol.equals("http")) {
            System.out.println("hyper text transfer protocol");
        } else if (protocol.equals("ftp")) {
            System.out.println("file transfer protocol");
        }

        String type = url.substring(url.indexOf(".") + 1);
        type = type.substring(type.indexOf(".") + 1);

        if (type.startsWith("com")) {
            System.out.println("commercial");
        } else if (type.startsWith("org")) {
            System.out.println("orginization");
        } else if (type.startsWith("net")) {
            System.out.println("network");
        }
    }
}
