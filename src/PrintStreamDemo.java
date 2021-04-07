package src;

import java.io.*;

class Student4 {
    int rollno;
    String name;
    String dept;
}

public class PrintStreamDemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("/Users/jasonballadares/repos/abdulbaricorejava/student.txt");
        PrintStream ps = new PrintStream(fos);

        Student4 s = new Student4();
        s.rollno = 10;
        s.name = "John";
        s.dept = "CSE";

        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);

        ps.close();
        fos.close();

    }
}
