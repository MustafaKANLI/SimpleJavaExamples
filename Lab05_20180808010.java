package Labs;
/**
 * @author Mustafa KANLI
 * @since 24.11.2020
 */

public class Lab05_20180808010 {
	
	public static void main(String[] args) {
		
		Printer();
		
	}
		
	
	public static void Printer() {
		int A = 65; // It is an A's ASCII decimal value
		int Z = 90; // It is a Z's ASCII decimal value
		for(int i = A; i<=Z; i++) { // I know I can use 65 and 90 instead of A and Z.
			for(int j = A; j<=i; j++) { // I want to show using ASCII.
				System.out.print((char) i);
				
			}
			System.out.println("");
		}
		
	}

}
