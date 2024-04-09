package LinearSearchAlgorithm;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[] ={2, 4 , 66, 77, 88,9};
        System.out.println(searchInRange(arr, 66, 1, 4));
    }

    static int searchInRange(int arr[], int target, int si, int ei){
        //edge case.
        if(arr.length == 0) return  -1;
        for(int i = si;i<= ei;i++){
            if(arr[i] == target){
                return  i;
            }
        }
        return -1;
    }
}
