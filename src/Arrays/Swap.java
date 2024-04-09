package Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int arr[] = {21, 2, 4, 5, 7};
//        swap(arr, 1, 3);
        reverse(arr); 
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[], int si, int ei){
        int tem = arr[si];
        arr[si] = arr[ei];
        arr[ei] = tem;
    }

    public static void reverse(int[]arr){
        int si = 0;
        int ei = arr.length-1;
        while(si<ei){
            swap(arr, si, ei);
            si++;
            ei--;
        }
    }
}
