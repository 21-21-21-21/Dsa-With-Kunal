package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr = {12, 13, 55, 66, 78, 90, 99};
        int target = 78;
//        System.out.println(binarySearch(arr, target));
        System.out.println(RecursiveBinarySearch(arr, 0, arr.length-1, target));
    }

    static int binarySearch(int arr[], int target){
        int low = 0;
        int high  = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return  mid;
            }else if(target>arr[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return  -1;
    }
    static int RecursiveBinarySearch(int[]arr, int si , int ei, int target){
        while(si<=ei){
            int mid = (si+ei)/2;
            if(arr[mid] == target)return mid;
            else if (arr[mid]<target) {
                return RecursiveBinarySearch(arr, mid+1, ei, target);
            }else{
                return RecursiveBinarySearch(arr, si, mid-1, target);
            }
        }
        return -1;
    }
}
