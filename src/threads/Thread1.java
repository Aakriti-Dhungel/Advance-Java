package threads;

 import adj.Account;
 
public class Thread1  extends Thread {
 Account acc;
 
 public Thread1(Account acc) {
	 this.acc = acc;
 }
 
 public void run() {
	 acc.withDraw(1000);
 }
	
}
