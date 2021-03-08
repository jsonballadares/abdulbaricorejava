package src;

import java.util.Date;

class Student2 {
    private String rollNo;

    private static int count = 1;

    private String assignRollNo() {
        Date d = new Date();

        String rno = "Univ-" + (d.getYear() + 1900) + "-" + count;
        count++;
        return rno;
    }

    Student2() {
        rollNo = assignRollNo();
    }

    public String getRollNo() {
        return rollNo;
    }

}

public class SCStatic1 {
    static public void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        Student2 s3 = new Student2();

        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());

    }
}
