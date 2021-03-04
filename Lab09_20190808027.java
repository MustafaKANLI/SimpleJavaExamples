package Labs;
import java.util.Scanner;
public class Lab09_20190808027 {
    public static boolean findDuplicateRows(int[][] array) {

        for (int i=0; i < array.length; i++) {
            for (int j=0; j < array.length; j++) {
                for (int k=1; k < array.length; k++){
                    if (array[j+k][i] == array[j][i]) {
                        if (array[j][i] != 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String args[]){

        System.out.print("Enter 2D array size : ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();

        System.out.println("Enter array elements : ");

        int twoD[][]=new int[rows][columns];


        for(int i=0; i<rows;i++)
        {
            for(int j=0; j<columns;j++)
            {
                twoD[i][j]=sc.nextInt();
                System.out.println("***");
            }
        }
        System.out.print("\nData you entered : \n");
        for(int []x:twoD){
            for(int y:x){
                System.out.print(y+"        ");
            }
            System.out.println();
        }

    }
}
