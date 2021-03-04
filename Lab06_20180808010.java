package Labs;
/**
 * @author Mustafa KANLI
 * @since 01.12.2020
 */
import java.util.Scanner;

public class Lab06_20180808010 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your word: ");
		
		String message = input.next();
		
		String encrypted = "";
		
		for(int i = 0; i<message.length(); i += 2) {

			if(message.length() % 2 == 0) {
				encrypted += message.charAt(i+1);
				encrypted += message.charAt(i);
				
			}	
			else {
				message += " ";
				encrypted += message.charAt(i+1);
				encrypted += message.charAt(i);
				
			}
			
		}
		
		System.out.println("Message: " + message);
		System.out.println("Encrypted message: " + encrypted);
		
	}
	
	
}
