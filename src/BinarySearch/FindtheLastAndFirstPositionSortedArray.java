package BinarySearch;

public class FindtheLastAndFirstPositionSortedArray {
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(getFistAndLast(arr, target));
    }

    static int []getFistAndLast(int []arr, int target){
        int []res = new int[2];
        res[0] = firstOcc(arr, target);
        res[1] = LastOcc(arr, target);
        return res;
    }
    static int firstOcc(int[]arr, int target){
        int low = 0;
        int high = arr.length-1;
        //track a FirstIndex
        int fOcc = -1;
        while(low<= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                fOcc = mid;
                high = mid-1;
            }else if(arr[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return fOcc;
    }
    static int LastOcc(int[]arr, int target){
        int low = 0;
        int high = arr.length-1;
        //track a FirstIndex
        int LOcc = -1;
        while(low<= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                LOcc = mid;
                low = mid+1;
            }else if(arr[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return LOcc;
    }
}
