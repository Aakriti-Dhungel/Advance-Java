package exceptionhandling;
import java.util.Scanner;

public class ExceptionDemo {
	static void validate(int age) {
		try {
			if(age < 18) {
				throw new Exception("Invalid age");
			}
			else {
				System.out.println("You can vote now.");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int a = sc.nextInt();
		validate(a);
	}
}
