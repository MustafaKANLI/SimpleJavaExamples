package Labs;
/**
 * @author Mustafa KANLI
 * @since 27.10.2020
 */
import java.util.Scanner;

public class Lab02_20180808010 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to root finder for 2nd degree equations");
		System.out.print("Enter a: ");
		int a = input.nextInt();
		
		System.out.print("Enter b: ");
		int b = input.nextInt();
		
		System.out.print("Enter c: ");
		int c = input.nextInt();
		
		double delta = b*b - (4*a*c);
		
		if(delta > 0) {  // There are 2 different roots
			
			double x1 = (-b - Math.sqrt(delta)) / 2*a;
			double x2 = (-b + Math.sqrt(delta)) / 2*a;
			
			System.out.println("Those roots: " + x1 + " , " + x2);
			
		}
		
		else if(delta == 0) { // Roots are same
			
			double x = -b / 2*a;
			
			System.out.println("The root is: " + x);
			
		}
		
		else {

			System.out.println("There isn't real root");
			
		}
			
	}
	
}
