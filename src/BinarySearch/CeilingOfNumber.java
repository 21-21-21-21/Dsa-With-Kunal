package BinarySearch;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 7, 9, 14};
        int target = 8;
        System.out.println(Ceiling(arr, target));
    }
    static int Ceiling(int arr[], int target){
        int si = 0;
        int ei = arr.length-1;

        while(si<=ei){
            int mid = (si+ei)/2;
            if(arr[mid] == target)return  mid;
            else if(target>arr[mid]){
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        return si;
    }
}
