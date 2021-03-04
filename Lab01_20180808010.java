package Labs;
/**
 * @author Mustafa KANLI
 * @since 21.10.2020
 */
import java.util.Scanner;

public class Lab01_20180808010 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the long side of rectangle: ");
		double longSide = input.nextDouble();
		
		System.out.print("Please enter the short side of rectangle: ");
		double shortSide = input.nextDouble();
		
		double area = longSide * shortSide;
		double perimeter = 2*(longSide + shortSide);
		
		System.out.println("Area of rectangle: " + area);
		System.out.println("Perimeter of rectangle: " + perimeter);
		
		input.close();
		
	}
	
}
