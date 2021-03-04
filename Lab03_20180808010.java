package Labs;
/**
 * @author Mustafa KANLI
 * @since 03.11.2020
 */
import java.util.Scanner;


public class Lab03_20180808010 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to area calculator of a triangle");
		System.out.print("Enter a: ");
		double a = input.nextDouble();
		
		System.out.print("Enter b: ");
		double b = input.nextDouble();
		
		System.out.print("Enter c: ");
		double c = input.nextDouble();
		
		if (a>0 && b>0 && c>0) {
			if ((a+b) > c && (a+c) > b && (b+c) > a) {
				double s = (a+b+c) / 2; // s is half of triangle's perimeter
				double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
				
				System.out.println("Area is: " + area);	
			}
			
			else
				System.out.println("ERROR! Invalid Triangle");
		}
		
		else
			System.out.println("ERROR! Invalid value. Values must be positive");
		
	}
}
