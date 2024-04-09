package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //create an array
        //Arrays of Primitive .
        int arr[] = new int[5];

        //take user input.
        for(int i = 0;i<arr.length;i++){
           //arr[i] = sc.nextInt();
        }
        //print the array.
       /*
       for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        */

        //another method to print the array is
        //for(int num:arr){
        //    System.out.print(num + " ");
        //}

        //Using this method u can also be print.
        System.out.println(Arrays.toString(arr));
        //System.out.println(arr[5]); //give u "Index Out Of Bound Error!!"



        //Arrays Of Objects.
        String str [] = new String[4];
        for(int i = 0;i<str.length;i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
