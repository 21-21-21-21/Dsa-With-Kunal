package Arrays;

import java.util.Arrays;

public class PassingInFun {
    public static void main(String[] args) {
        int nums[] = {12, 34, 54, 1};
        System.out.println(Arrays.toString(nums));
        changeOth(nums); //here array shows "Mutable Behaviour"
        System.out.println(Arrays.toString(nums));
    }

    //Create a method to change value in array.
    static void changeOth(int arr[]){
        arr[0] = 999;
    }

}
