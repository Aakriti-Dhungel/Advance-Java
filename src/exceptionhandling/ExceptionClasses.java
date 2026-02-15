package exceptionhandling;

import java.util.Scanner;

public class ExceptionClasses {
	public static void main(String[] args) throws UnderAgeException,NationalityException{
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter your age:");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter your nationality:");
			String nationality = sc.nextLine();
			
			if(age < 18 && nationality.equalsIgnoreCase("Nepali")) {
				throw new UnderAgeException("Under Age: Not eligible to vote.");
			}else if(age >=18 && !nationality.equalsIgnoreCase("Nepali")){
				throw new NationalityException("Nationality Error: Only Nepali citizen can vote.");
				
			}else if(age < 18 && !nationality.equalsIgnoreCase("Nepali")) {
				throw new UnderAgeException("Under Age and Not Nepali");
			}
			else {
				System.out.println("Eligible to vote");
			}
		}catch(UnderAgeException | NationalityException e) {
			System.out.println("Exception occured: " + e.getMessage());
		}
	}
	}
