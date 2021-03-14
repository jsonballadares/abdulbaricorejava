package src;

class MyRun implements Runnable {
    public void run() {
    }
}

class MyThread extends Thread {
    public void run() {
        int counter = 0;
        while (counter != 99) {
            System.out.println(counter++);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public MyThread(String name) {
        super(name);
    }
}

public class ThreadTest2 {
    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread("mythread");
        t.start();
        t.interrupt();
    }
}
