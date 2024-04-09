package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int arr[] = {-18, -12, -4, 0, 2, 3 , 4, 15, 16, 18, 22, 45, 89};
        int arr[] = {99, 89,77, 56,45, 34,22, -1}; //descending.
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[]arr,int target){
        int si = 0;
        int ei = arr.length-1;

        //find whether the array is sorted ascending order or descending order
        boolean isAsc = arr[si]< arr[ei];

        while(si<=ei){
            int mid = (si+ei)/2;
            if(arr[mid] == target)return mid;


            if(isAsc){
                if (arr[mid]<target) {
                    si = mid+1;
                }else{
                    ei = mid-1;
                }
            }else{
                if (arr[mid]<target) {
                    ei = mid-1;
                }else{
                    si = mid+1;
                }
            }

        }
        return -1;
    }
}
