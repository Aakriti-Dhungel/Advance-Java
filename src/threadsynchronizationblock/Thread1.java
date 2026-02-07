// Lab Title: Implementation of Thread Synchronization in Java using Synchronized Method
package threadsynchronizationblock;

public class Thread1 extends Thread {
    Account acc;

    public Thread1(Account acc) { this.acc = acc; }

    public void run() {
        acc.withdraw(1000);
    }
}
