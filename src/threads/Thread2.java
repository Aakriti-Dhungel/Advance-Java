package threads;
 import adj.Account;
public class Thread2 extends Thread  {
 Account acc;
 
 public Thread2(Account acc) {
	 this.acc = acc;
 }
 
 public void run() {
	 acc.withDraw(300);
 }
	
}
