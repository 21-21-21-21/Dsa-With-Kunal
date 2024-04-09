package BinarySearch;

public class Floor {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 8, 9, 10};
        int target = 4;
        System.out.println(floorOfNumber(arr, target));
    }
    static int floorOfNumber(int arr[], int target){
        int si = 0;
        int ei = arr.length-1;

        while(si<= ei){
            int mid = (si+ei)/2;
            if(arr[mid] ==  target)return mid;
            else if(arr[mid]<target) {
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        return ei;
    }
}
