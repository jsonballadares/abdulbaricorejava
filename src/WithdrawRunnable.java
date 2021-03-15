package src;

public class WithdrawRunnable extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= count; i++) {
                account.withdraw(amount);
                Thread.sleep(DELAY);
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
