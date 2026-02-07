// Lab Title: Implementation of Thread Synchronization in Java using Synchronized Block
package threadsynchronizationblock;

public class Account {
    int amount = 1000;

    public void withdraw(int a) {
        // Synchronized Block (critical section)
        synchronized(this) {
            if(a <= amount) {
                amount -= a;
                System.out.println("Transaction Successful");
                System.out.println("Remaining Amount: " + amount);
            } else {
                System.out.println("Insufficient amount");
            }
        }
    }
}

