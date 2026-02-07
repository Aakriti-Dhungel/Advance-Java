// Lab Title: Implementation of Thread Synchronization in Java using Synchronized Method
package threadsynchronizationmethod;

public class Account {
    int amount = 1000;

    // Synchronized Method
    public synchronized void withdraw(int a) {
        if(a <= amount) {
            amount -= a;
            System.out.println("Transaction Successful");
            System.out.println("Remaining Amount: " + amount);
        } else {
            System.out.println("Insufficient amount");
        }
    }
}
