package Labs;
/**
 * @author Mustafa KANLI
 * @since 29.12.2020
 */
import java.util.Scanner;
//import java.util.Arrays;

public class Lab09_20180808010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the row number");
        int row = input.nextInt();
        System.out.println("Please enter the column number");
        int column = input.nextInt();

        int[][] array = new int[row][column];
        for(int i = 0; i<row; i++){
            for(int j = 0; j<column; j++){
                System.out.println("Please enter the array's elements");
                array[i][j] = input.nextInt();
            }
        }

        System.out.println("Your array table: ");
        for(int[] arr: array){
            for(int i: arr){
                System.out.print(i+"     ");
            }
            System.out.println();
        }


        findDuplicateRows(array);
    }
    public static void findDuplicateRows(int[][] array){
        int[] temp = new int[array[0].length];
       // int[] temp2 = new int[array[0].length];
        String str = "";
        for(int i = 0; i< array.length; i++){
            for(int j = 0; j< array[0].length; j++){
                temp = array[i];
             //   temp2 = array[i+1];
                /*while(temp == array[i]){
                    for(int k = 0; k< temp.length; k++){
                        str += temp[k] + " ";
                    }
                }*/

            }

            for(int j = 0; j< temp.length;j++){
                if(temp[j] == array[i][j]){
                    for(int k = 0; k< temp.length; k++){
                        str += temp[k] + " ";
                    }

                }

            }

        }

        System.out.println(str);
    }
}
