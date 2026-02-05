package threads;

public class Main {

	public static void main(String args[]) {
		

//		LoopDemo ld = new LoopDemo();
//		
//		ld.start();
//		
//		LoopTest lt = new LoopTest();
//		
//		lt.start();
		
//		Demo d = new Demo();   // Race Condition - same resourse trying to access by different thread , So we use thread synchronization to prevent race condition
//		Thread t = new Thread(d);
//		t.start();
////		d.start();
//		
		
		// Amount , Thread1 ,Thread2
		Account acc = new Account();
		
		Thread1 t1 = new Thread1(acc);
		
		Thread2 t2 = new Thread2(acc);
		
		t1.start();
		t2.start();
		
		
		// Thread and Exception
		
		
	}
	
}
