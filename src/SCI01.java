package src;

import java.io.*;

public class SCI01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis1 = new FileInputStream("/Users/jasonballadares/repos/abdulbaricorejava/input.txt");
        FileInputStream fis2 = new FileInputStream("/Users/jasonballadares/repos/abdulbaricorejava/output.txt");
        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
        FileOutputStream fos = new FileOutputStream("/Users/jasonballadares/repos/abdulbaricorejava/combined.txt");

        int b;
        while ((b = sis.read()) != -1) {
            fos.write(b);
        }

        fis1.close();
        fis2.close();
        sis.close();
        fos.close();
    }

}
