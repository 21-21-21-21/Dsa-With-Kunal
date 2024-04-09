package LinearSearchAlgorithm;


public class LSearch {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int index = LinerSearch(nums, 5);

        if(index == -1){
            System.out.println("The target element doesn't exists!");
        }else{
            System.out.println("The element exists at index :" + index);
        }
    }

    //Search in array :
    //If the target is found the return the index
    // If not found return -1
    static int LinerSearch(int []arr, int target){

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        // if not found.
        return -1;
    }
}
