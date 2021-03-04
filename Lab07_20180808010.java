package Labs;

/**
 * @author Mustafa KANLI
 * @since 15.12.2020
 */
import java.util.Scanner;

public class Lab07_20180808010 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int length = input.nextInt();
		int[] arr = new int[length];

		for(int i = 0; i<length; i++){
			System.out.println("Enter the " + (i + 1) + ". element of the array:");
			arr[i] = input.nextInt();
		}
		System.out.println("Your array is: " + toString(arr));
		System.out.println("Sum of the array: " + sum(arr));
		System.out.println("Avg of the array: " + avg(arr, length));
		System.out.println("Min value of the array: " + minValue(arr));
		System.out.println("Max value of the array: " + maxValue(arr));


	}
	
	public static int sum(int[] arr) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	public static double avg(int[] arr, int length){
		return (double)sum(arr)/length;
	}
	public static int minValue(int[] arr){
		int minVal = (int) avg(arr, arr.length);
		for(int i = 0; i<arr.length; i++){
			if(arr[i] <= minVal)
				minVal = arr[i];
		}
		return minVal;
	}
	public static int maxValue(int[] arr){
		int maxVal = (int) avg(arr, arr.length);;
		for(int i = 0; i<arr.length; i++){
			if(arr[i] >= maxVal)
				maxVal = arr[i];
		}
		return maxVal;
	}
	public static String toString(int[] arr){

		String str = "";
		for(int i = 0; i< arr.length; i++) {
			if(i < arr.length-1)
				str += (arr[i] + ", ");
			else
			str += arr[i];

		}
		return str;

	}

}
