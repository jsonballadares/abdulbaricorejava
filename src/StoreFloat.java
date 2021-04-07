package src;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StoreFloat {
    public static void main(String[] args) throws IOException {
        // Crappy Serilization
        float list[] = { 1.2f, 3.45f, 6.78f, 9.01f, 2.34f };
        FileOutputStream fos = new FileOutputStream("/Users/jasonballadares/repos/abdulbaricorejava/floatdata.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(list.length);
        for (float f : list) {
            dos.writeFloat(f);
        }
        dos.close();
        fos.close();

        // Crappy Deserilization
        FileInputStream fis = new FileInputStream("/Users/jasonballadares/repos/abdulbaricorejava/floatdata.txt");
        DataInputStream dis = new DataInputStream(fis);
        int length = dis.readInt();
        float data;

        for (int i = 0; i < length; i++) {
            data = dis.readFloat();
            System.out.println(data);
        }
        dis.close();
        fis.close();
    }
}
