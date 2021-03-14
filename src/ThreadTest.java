package src;

class ThreadTest implements Runnable {
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(i++ + " Hello");
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadTest());
        t.start();
        int i = 0;
        while (true) {
            System.out.println(i++ + " World");
        }
    }
}