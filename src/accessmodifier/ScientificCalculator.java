package accessmodifier;

public class ScientificCalculator {
	
	private int result() {
		System.out.println("This is result");
	}
 public int multiply(int a , int b) {
	 return a * b;
 }
 public double divide(int a , int b) {
	 return a / b;
 }
 public void displayDetails() {
	 Calculator c = new Calculator();
	 
	 System.out.println( c.add(4,5));
	 System.out.println( c.subtract(4,5));
 }
 

}
