package threads;

public class Account {

	int amount = 1000;
	
	public void withDraw(int a) {
		
		synchronized (this) {
			if(a <= amount) {
				amount -= a;
				System.out.println("Transaction Successful");
				System.out.println("Remaining Amount: " + amount);
			}	
			
			else {
				System.out.println("Insufficient amount");
			}	
		}	
		
	}
	
	
	
}
