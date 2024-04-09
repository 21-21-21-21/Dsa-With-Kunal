package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
           1 2 3
           4 5 6
           7 8 9

         */

        int m[][] = new int[3][]; // in 2d array put the row is mandatory,but not the col.

        //or you can do.
        int matrix[][] = {
                {1, 2, 3}, //0th Index
                {4, 5}, // 1st Index
                {6,7, 8, 9}  // 2nd Index -> matrix[2] = {6,7,8,9}
        };

        int arr2[][]  = new int[3][3];
        System.out.println(arr2.length); //give me the no of rows.

        //Take input.
        for(int row = 0; row<arr2.length; row++){
            //for each col in every row.
            for(int col = 0; col<arr2[row].length; col++){
                arr2[row][col] = sc.nextInt();
            }
        }

        //OutPut.
        for(int row = 0; row<arr2.length; row++){
            //for each col in every row.
            for(int col = 0; col<arr2[row].length; col++){
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();
        }

        //Print another way.
        for(int row = 0; row<arr2.length;row++){
            System.out.println(Arrays.toString(arr2[row]));
        }

        //Print using For each loop.
        for(int [] a : arr2){
            System.out.println(Arrays.toString(a));
        }
    }
}
