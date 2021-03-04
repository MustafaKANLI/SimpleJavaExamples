package Labs;
/**
 * @author Mustafa KANLI
 * @since 05.01.2021
 */

public class Lab10_20180808010 {
    public static void main(String[] args) {

        int[][] array = {{1,5,6}, {1,2,7}, {2,3,5}}; // If you want to take input, I would.
                                                    // So I defined static not dynamic
        findOverAvgRows(array);
        System.out.println("*********");
        findBelowAvgColumns(array);

    }

    public static void findOverAvgRows(int[][] array){
        String str = "";
        double avg = 0;
        double total = 0;

        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                total += array[i][j];
            }
            avg = total/array[i].length;
            for(int j = 0; j<array[i].length; j++){
                if(array[i][j] > avg && j != array[i].length - 1){
                    str += "index " + j +": " + array[i][j] + ", ";
                }
                else if(array[i][j] > avg && j == array[i].length - 1) {
                    str += "index " + j +": " + array[i][j];
                }

            }

            System.out.println(str);
            total = 0;
            str = "";
        }
    }
    public static void findBelowAvgColumns(int[][] array){
        String str = "";
        double avg = 0.0;
        double total = 0;

        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                total += array[j][i];
            }
            avg = total/array[i].length;
            for(int j = 0; j<array[i].length; j++){
                if(array[j][i] < avg && j != array[i].length - 1){
                    str += "index " + j +": " + array[j][i] + ", ";
                }
                else if(array[j][i] < avg && j == array[i].length - 1){
                    str += "index " + j +": " + array[j][i] + "";
                }
            }

            System.out.println(str);
            total = 0;
            str = "";
        }
    }

}
