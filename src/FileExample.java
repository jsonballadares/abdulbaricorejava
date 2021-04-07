package src;

import java.io.FileNotFoundException;
import java.io.*;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {

        try {
            try (FileOutputStream fos = new FileOutputStream(
                    "/Users/jasonballadares/repos/abdulbaricorejava/test.txt");) {
                String str = "Learn Java Programming";

                byte[] b = str.getBytes();

                for (byte x : b) {
                    fos.write(x);
                }

                fos.close();
            }

            try (FileInputStream fis = new FileInputStream(
                    "/Users/jasonballadares/repos/abdulbaricorejava/test.txt");) {

                int x;
                do {
                    x = fis.read();
                    System.out.print((char) x);
                } while (x != -1);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
