package threadsynchronizationblock;


public class Thread2 extends Thread {
    Account acc;

    public Thread2(Account acc) { this.acc = acc; }

    public void run() {
        acc.withdraw(300);
    }
}