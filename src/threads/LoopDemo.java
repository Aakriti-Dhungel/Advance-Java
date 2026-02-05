package threads;

public class LoopDemo extends Thread{

	public void run() { // thread must have run method , to execute thread
		for(int i=0;i<5;i++) {
			System.out.println(i);
			
		}
	}
}
