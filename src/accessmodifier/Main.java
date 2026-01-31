package accessmodifier;

public class Main {

	public static void main(String args[]) {
		ScientificCalculator c = new ScientificCalculator();
		System.out.println(c.multiply(5, 4));
		System.out.println(c.divide(5, 4));
//		c.result = 10; // cannot access because its private variable
		
//		c.result(); // cannot access because its private variable

	}
}