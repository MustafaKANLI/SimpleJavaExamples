package Labs;

/**
 * @author Mustafa KANLI
 * @since 22.12.2020
 */
import java.util.Scanner;

public class Lab08_20180808010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        do{
            System.out.println("Please enter the k");
            k = input.nextInt();
        }while(k<0 && k<array.length);


        array = transform(array, "left", k);
        for(int i = 0; i< array.length; i++){
          System.out.print(array[i]);
        }
        System.out.println("\n*******");

        array1 = transform(array1, "right", k);
        for(int i = 0; i< array1.length; i++){
            System.out.print(array1[i]);
        }

    }
    public static int[] transform(int[] array, String direction, int k){

        if(direction == "left"){
            for (int i = 0; i < k; i++){
                singleRotateLeft(array);
            }
        }
        else if(direction == "right"){
            for (int i = array.length ; i > k; i--){
                singleRotateRight(array);
            }

        }

        return array;
    }
    public static void singleRotateLeft(int array[])
    {
        int i;

        int temp = array[0];
        for (i = 0; i < array.length - 1; i++)
            array[i] = array[i + 1];

        array[i] = temp;
    }
    public static void singleRotateRight(int array[])
    {
        int i;

        int temp = array[0];
        for (i = 0; i < array.length - 1; i++)
            array[i] = array[i + 1];

        array[i] = temp;

    }
}
