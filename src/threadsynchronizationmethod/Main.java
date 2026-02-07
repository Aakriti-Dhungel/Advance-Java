package threadsynchronizationmethod;

public class Main {
	  public static void main(String[] args) {
	        Account acc = new Account();

	        Thread1 t1 = new Thread1(acc);
	        Thread2 t2 = new Thread2(acc);

	        t1.start();
	        t2.start();
}
}
