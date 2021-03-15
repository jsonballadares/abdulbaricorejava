package src;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadedHelloWorld implements Runnable {
    public static void main(String[] args) {
        Runnable r1 = new ThreadedHelloWorld("Hello, World!");
        Runnable r2 = new ThreadedHelloWorld("Goodbye");
        ExecutorService pool = Executors.newFixedThreadPool(10);
    }

    private String greeting;

    public ThreadedHelloWorld(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10 && !Thread.interrupted(); i++) {
                System.out.println(new Date() + " " + greeting);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
