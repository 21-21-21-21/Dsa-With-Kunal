package Arrays;

 public class MaxiItem {
    public static void main(String[] args) {
       int [] arr = {21, 34, 2, 77, 9};
        System.out.println(max(arr));
        //max element between range.
        System.out.println(maxInRange(arr, 0, 2));
    }
    static int max(int arr[]){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
           if(arr[i]>maxi){
               maxi = arr[i];
           }
        }
        return  maxi;
    }

    //in a Particular range find out the Maximum and minimum.
     static  int maxInRange(int[]arr, int st, int end){
        //edge case.
         //my array is empty.
         if(arr.length == 0)return  -1;

        int max = arr[st];
        for(int i = st;i<=end;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return  max;
     }
}
