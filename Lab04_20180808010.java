package Labs;
/**
 * @author Mustafa KANLI
 * @since 17.11.2020
 */
import java.util.Scanner;

public class Lab04_20180808010 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		
		long number = input.nextLong();
		int sum = 0;
		for(int i = 1; i<number; i++) {
			if(number % i == 0)
				sum = sum + i;
			
		}
		
		if (sum == number) 
			System.out.println(number + " is a valid number");
		
		else 
			System.out.println(number + " is not a valid number");
		
		
	}
}
